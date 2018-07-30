package com.study.cloud.model.VO;


import com.study.cloud.model.po.BbqOrderDetails;

public interface BbqOrderDetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbqOrderDetails record);

    int insertSelective(BbqOrderDetails record);

    BbqOrderDetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BbqOrderDetails record);

    int updateByPrimaryKey(BbqOrderDetails record);
}