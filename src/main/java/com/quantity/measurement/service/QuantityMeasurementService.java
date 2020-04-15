package com.quantity.measurement.service;

import com.quantity.measurement.enumeration.MainUnitType;
import com.quantity.measurement.enumeration.UnitType;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuantityMeasurementService {
    public MainUnitType[] getMainUnitType() {
        return MainUnitType.values();
    }

    public List<UnitType> getUnitType(MainUnitType unitType) {
        return Arrays.stream(UnitType.values())
                .filter(unitType1 -> unitType1.mainUnitType.equals(unitType))
                .collect(Collectors.toList());
    }

}
