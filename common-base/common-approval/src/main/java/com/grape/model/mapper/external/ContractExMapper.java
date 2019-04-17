package com.grape.model.mapper.external;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import com.grape.controller.request.ProductnoAndAeraAndChannelnoRequest;
import com.grape.model.db.Contract;

@Mapper
public interface ContractExMapper {

    List<Contract> selectContracts(ProductnoAndAeraAndChannelnoRequest request) ;

}

