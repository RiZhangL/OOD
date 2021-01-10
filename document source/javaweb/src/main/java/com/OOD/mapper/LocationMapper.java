package com.OOD.mapper;

import com.OOD.pojo.Location;
import com.OOD.pojo.Station;

public interface LocationMapper {
    public Location selectLocation(int station_id);
}
