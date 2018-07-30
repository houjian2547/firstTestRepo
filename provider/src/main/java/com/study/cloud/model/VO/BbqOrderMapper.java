package com.study.cloud.model.VO;


import com.study.cloud.model.po.BbqOrder;

public interface BbqOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbqOrder record);

    int insertSelective(BbqOrder record);

    BbqOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BbqOrder record);

    int updateByPrimaryKey(BbqOrder record);
}