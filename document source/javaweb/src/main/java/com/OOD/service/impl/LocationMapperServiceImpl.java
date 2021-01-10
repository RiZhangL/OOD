package com.OOD.service.impl;

import com.OOD.mapper.LocationMapper;
import com.OOD.mapper.ServiceMapper;
import com.OOD.pojo.Location;
import com.OOD.service.LocationMapperService;
import com.OOD.service.ServiceMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationMapperServiceImpl implements LocationMapperService {

    @Autowired
    LocationMapper mapper;

    public Location selectLocation(int station_id) {
        // TODO Auto-generated method stub
        return mapper.selectLocation(station_id);
    }
}
