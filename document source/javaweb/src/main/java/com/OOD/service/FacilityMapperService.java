package com.OOD.service;

import com.OOD.pojo.Facility;
import com.OOD.pojo.Location;

import java.util.List;

public interface FacilityMapperService {
    public List<Facility> selectAllFacility();
}
