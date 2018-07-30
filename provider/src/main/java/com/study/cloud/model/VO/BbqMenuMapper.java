package com.study.cloud.model.VO;


import com.study.cloud.model.po.BbqMenu;

public interface BbqMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbqMenu record);

    int insertSelective(BbqMenu record);

    BbqMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BbqMenu record);

    int updateByPrimaryKey(BbqMenu record);
}