package com.basireddy.family.gurramkonda.controllers;

import com.basireddy.family.gurramkonda.entities.IndiraFamily;
import com.basireddy.family.gurramkonda.services.BaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseController {

    private final BaseService baseService;

    public BaseController(BaseService baseService) {
        this.baseService = baseService;
    }

    @GetMapping("/getallmembers")
    public List<IndiraFamily> getAllMembers( ){
         return baseService.findAll();
    }
}
