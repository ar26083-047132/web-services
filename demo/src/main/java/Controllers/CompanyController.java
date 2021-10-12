package Controllers;


import Entity.ListCompany;
import Services.MainPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/Controllers/CompanyController")
public class CompanyController {
    private final MainPage page;

    @Autowired
    public CompanyController(MainPage page){
        this.page = page;
    }
    @GetMapping
    public List<ListCompany> getCompany(){
        return getCompany();
    }
}
