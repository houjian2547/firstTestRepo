package com.study.cloud.controller;

import com.study.cloud.model.Person;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId, HttpServletRequest
            request) {
        Person person = new Person(personId, "Crazyit", 30);
        // 为了查看结果，将请求的URL 设置到Person 实例中
        person.setMessage(request.getRequestURL().toString());
        return person;
    }
}
