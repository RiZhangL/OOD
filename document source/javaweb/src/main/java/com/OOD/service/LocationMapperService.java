package com.OOD.service;

import com.OOD.pojo.Location;
import com.OOD.pojo.Service;

import java.util.List;

public interface LocationMapperService {
    public Location selectLocation(int station_id);
}
