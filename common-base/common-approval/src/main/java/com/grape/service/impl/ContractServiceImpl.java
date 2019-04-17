package com.grape.service.impl;

import java.util.List;

import com.grape.model.mapper.external.ContractExMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.ContractRequest;
import com.grape.controller.request.ProductnoAndAeraAndChannelnoRequest;
import com.grape.model.db.Contract;
import com.grape.model.db.ContractExample;
import com.grape.model.mapper.base.ContractMapper;
import com.grape.service.ContractService;
import com.grape.util.Util;

@Service
public class ContractServiceImpl implements ContractService {

    private static final Logger log = LoggerFactory.getLogger(ContractServiceImpl.class);

    @Autowired
    private ContractMapper contractMapper;
    @Autowired
    private ContractExMapper contractExMapper;

    @Override
    public void insertContract(ContractRequest req) {
        Contract con = new Contract();
        try {
            Util.transferFields(req, con);
        } catch (Exception e) {
            log.info("实体转换失败" + e);
        }
        contractMapper.insertSelective(con);
    }

    @Override
    public List<Contract> selectContract(ProductnoAndAeraAndChannelnoRequest req) {
        ContractExample example = new ContractExample();
        if (req.getChannelno() != null) {
            example.createCriteria().andProductnoEqualTo(req.getProductno()).andAeraEqualTo(req.getAera()).andChannelnoEqualTo(req.getChannelno());
            return contractMapper.selectByExample(example);
        }
        return null;
    }

    @Override
    public List<Contract> selectContracts(ProductnoAndAeraAndChannelnoRequest request) {
        List<Contract> contracts = contractExMapper.selectContracts(request);
        return contracts;
    }

}
