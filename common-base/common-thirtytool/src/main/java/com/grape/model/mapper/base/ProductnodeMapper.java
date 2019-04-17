package com.grape.model.mapper.base;

import com.grape.model.db.Productnode;
import com.grape.model.db.ProductnodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductnodeMapper {
    int countByExample(ProductnodeExample example);

    int deleteByExample(ProductnodeExample example);

    int deleteByPrimaryKey(@Param("type") String type, @Param("nodeid") String nodeid);

    int insert(Productnode record);

    int insertSelective(Productnode record);

    List<Productnode> selectByExample(ProductnodeExample example);

    Productnode selectByPrimaryKey(@Param("type") String type, @Param("nodeid") String nodeid);

    int updateByExampleSelective(@Param("record") Productnode record, @Param("example") ProductnodeExample example);

    int updateByExample(@Param("record") Productnode record, @Param("example") ProductnodeExample example);

    int updateByPrimaryKeySelective(Productnode record);

    int updateByPrimaryKey(Productnode record);
}