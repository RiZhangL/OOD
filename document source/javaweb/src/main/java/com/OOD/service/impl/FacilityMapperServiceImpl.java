package com.OOD.service.impl;

import com.OOD.mapper.FacilityMapper;
import com.OOD.mapper.ServiceMapper;
import com.OOD.pojo.Facility;
import com.OOD.service.FacilityMapperService;
import com.OOD.service.ServiceMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityMapperServiceImpl implements FacilityMapperService {

    @Autowired
    FacilityMapper mapper;

    public List<Facility> selectAllFacility() {
        // TODO Auto-generated method stub
        return mapper.selectAllFacility();
    }
}
