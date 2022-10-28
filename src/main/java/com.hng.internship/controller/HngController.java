package com.hng.internship.controller;


import com.hng.internship.model.HngDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hng.internship.service.HngService;


@RestController
public class HngController {

    @Autowired
    HngService service;

    @CrossOrigin(allowedHeaders = "*")
    @RequestMapping(method = RequestMethod.GET)
    public HngDetails getDetails(){
        return service.Details();
    }
}
