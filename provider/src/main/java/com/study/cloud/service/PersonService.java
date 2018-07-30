package com.study.cloud.service;

import com.study.cloud.model.Person;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:PersonService
 * @description:
 * @author:houjian
 * @date:2018/7/30 13:15
 * @version:
 */
public interface PersonService {

    Person selectUserById(@Param("id") Integer id);
}
