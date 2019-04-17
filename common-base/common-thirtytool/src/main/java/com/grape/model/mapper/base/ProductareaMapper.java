package com.grape.model.mapper.base;

import com.grape.model.db.Productarea;
import com.grape.model.db.ProductareaExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProductareaMapper {
    int countByExample(ProductareaExample example);

    int deleteByExample(ProductareaExample example);

    int deleteByPrimaryKey(@Param("areaid") String areaid, @Param("productno") String productno);

    int insert(Productarea record);

    int insertSelective(Productarea record);

    List<Productarea> selectByExample(ProductareaExample example);

    int updateByExampleSelective(@Param("record") Productarea record, @Param("example") ProductareaExample example);

    int updateByExample(@Param("record") Productarea record, @Param("example") ProductareaExample example);
}