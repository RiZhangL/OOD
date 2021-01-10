package com.OOD.service.impl;

import com.OOD.mapper.ServiceMapper;
import com.OOD.mapper.StationMapper;
import com.OOD.pojo.Station;
import com.OOD.service.ServiceMapperService;
import com.OOD.service.StationMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMapperServiceImpl implements ServiceMapperService {

    @Autowired
    ServiceMapper mapper;


    public List<com.OOD.pojo.Service> selectAllService() {
        // TODO Auto-generated method stub
        return mapper.selectAllService();
    }
}
