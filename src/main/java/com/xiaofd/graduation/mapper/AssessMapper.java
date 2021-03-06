package com.xiaofd.graduation.mapper;

import com.xiaofd.graduation.bean.Assess;
import com.xiaofd.graduation.bean.AssessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessMapper {
    long countByExample(AssessExample example);

    int deleteByExample(AssessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assess record);

    int insertSelective(Assess record);

    List<Assess> selectByExample(AssessExample example);

    Assess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assess record, @Param("example") AssessExample example);

    int updateByExample(@Param("record") Assess record, @Param("example") AssessExample example);

    int updateByPrimaryKeySelective(Assess record);

    int updateByPrimaryKey(Assess record);
}