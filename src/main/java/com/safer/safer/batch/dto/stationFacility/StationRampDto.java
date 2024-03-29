package com.safer.safer.batch.dto.stationFacility;

import com.opencsv.bean.CsvBindByPosition;
import com.safer.safer.facility.domain.Facility;
import com.safer.safer.station.domain.Station;
import com.safer.safer.batch.util.CsvUtil;
import lombok.Getter;

import static com.safer.safer.facility.domain.FacilityType.ACCESSIBLE_RAMP;

@Getter
public class StationRampDto {
    @CsvBindByPosition(position = 0)
    private String line;
    @CsvBindByPosition(position = 1)
    private String stationName;
    @CsvBindByPosition(position = 2)
    private String detailLocation;
    @CsvBindByPosition(position = 3)
    private String gate;

    public Facility toEntity(Station station) {
        return Facility.of(
                CsvUtil.generateNameByStation(station, ACCESSIBLE_RAMP.getName()),
                ACCESSIBLE_RAMP,
                station.getCoordinate(),
                "detailLocation="+CsvUtil.parseDetailLocation(detailLocation, gate),
                station
        );
    }
}
