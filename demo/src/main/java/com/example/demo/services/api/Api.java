package com.example.demo.services.api;

import com.admin.stock.services.exceptions.ServiceNotFoundException;
import com.admin.stock.services.model.Service;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class Api {

    private List<Service> services;

    public Api() {
        services = new ArrayList<>();
        services.add(new Service(1, "get", "get all stock"));
        services.add(new Service(2, "post", "add new stock"));
        services.add(new Service(3, "get", "all users"));
        services.add(new Service(4, "post", "add new user"));
    }

    @RequestMapping(method = RequestMethod.GET, value = "")
    public List<Service> findAll() {
        log.info("Service.findAll()");
        return services;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Service findById(@PathVariable("id") Integer id) throws ServiceNotFoundException {
        log.info(String.format("Customer.findById(%s)", id));
        Service service = services.stream()
                .filter(it -> it.getId().intValue() == id.intValue())
                .findFirst().orElseThrow(() -> new ServiceNotFoundException("id : " + id));

        return service;
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public Service createNewCustomer(@RequestBody Service service) {
        log.info("Service.createNewService()");
        if (service.getId() != null) {
            return null;
        }
        int size = services.size();
        service.setId(size + 1);
        services.add(service);
        return service;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean deleteService(@PathVariable Integer id) {
        log.info("Service.deleteService()");
        try {
            Service byId = findById(id);
            services.remove(byId);
        } catch (ServiceNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

}
