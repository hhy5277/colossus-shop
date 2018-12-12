package com.colossus.member.dao;

import com.colossus.member.model.AuthFilter;

public interface AuthFilterMapper {

    int deleteByPrimaryKey(String id);

    int insert(AuthFilter record);

    int insertSelective(AuthFilter record);

    AuthFilter selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AuthFilter record);

    int updateByPrimaryKey(AuthFilter record);
}