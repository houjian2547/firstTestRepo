package com.study.cloud.service.impl;

import com.study.cloud.dao.PersonDao;
import com.study.cloud.model.Person;
import com.study.cloud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName:PersonServiceImpl
 * @description:
 * @author:houjian
 * @date:2018/7/30 13:16
 * @version:
 */
@Service(value = "personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonDao personDao;

    public Person selectUserById(Integer id) {
        Person person = personDao.selectUserById(id);
        return person;
    }
}
