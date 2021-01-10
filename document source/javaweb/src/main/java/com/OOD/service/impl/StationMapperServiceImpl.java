package com.OOD.service.impl;

import com.OOD.mapper.StationMapper;
import com.OOD.pojo.Station;
import com.OOD.service.StationMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationMapperServiceImpl implements StationMapperService {

    @Autowired
    StationMapper mapper;

    public Station selectStation(int id) {
        // TODO Auto-generated method stub
        return mapper.selectStation(id);
    }
}
