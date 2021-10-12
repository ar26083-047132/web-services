package com.example.demo.services.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service extends Throwable {
    private Integer id;
    private String type;
    private String description;

    public Service(Integer id,
                   String description,
                   String type) {
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
