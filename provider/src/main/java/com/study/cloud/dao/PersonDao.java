package com.study.cloud.dao;

import com.study.cloud.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public interface PersonDao {

	Person selectUserById(Integer id);
}