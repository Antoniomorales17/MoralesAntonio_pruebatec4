package com.hackaboss.PruebaTecnica4.controller;

import com.hackaboss.PruebaTecnica4.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agency/persons")
public class PersonController {

    @Autowired
    private IPersonService personService;
}