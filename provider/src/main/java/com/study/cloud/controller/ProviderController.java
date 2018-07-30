package com.study.cloud.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.netflix.discovery.converters.Auto;
import com.study.cloud.model.Person;
import com.study.cloud.service.PersonService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProviderController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId, HttpServletRequest
            request) {
//        Person person = new Person(personId, "Crazyit", 30);
//        person.setMessage(request.getRequestURL().toString());
        Person person = personService.selectUserById(personId);
        return person;
    }

}
