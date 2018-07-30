package com.study.cloud.model.VO;


import com.study.cloud.model.po.BbqMember;

public interface BbqMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BbqMember record);

    int insertSelective(BbqMember record);

    BbqMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BbqMember record);

    int updateByPrimaryKey(BbqMember record);
}