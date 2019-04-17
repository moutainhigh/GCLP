package com.grape.model.mapper.base;

import com.grape.model.db.Mortgagematch;
import com.grape.model.db.MortgagematchExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MortgagematchMapper {
    int countByExample(MortgagematchExample example);

    int deleteByExample(MortgagematchExample example);

    int deleteByPrimaryKey(@Param("mortgageno") String mortgageno, @Param("matchno") String matchno);

    int insert(Mortgagematch record);

    int insertSelective(Mortgagematch record);

    List<Mortgagematch> selectByExample(MortgagematchExample example);

    Mortgagematch selectByPrimaryKey(@Param("mortgageno") String mortgageno, @Param("matchno") String matchno);

    int updateByExampleSelective(@Param("record") Mortgagematch record, @Param("example") MortgagematchExample example);

    int updateByExample(@Param("record") Mortgagematch record, @Param("example") MortgagematchExample example);

    int updateByPrimaryKeySelective(Mortgagematch record);

    int updateByPrimaryKey(Mortgagematch record);
}