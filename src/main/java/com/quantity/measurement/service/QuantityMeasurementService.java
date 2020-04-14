package com.quantity.measurement.service;

import com.quantity.measurement.enumeration.MainUnitType;
import org.springframework.stereotype.Service;

@Service
public class QuantityMeasurementService {
    public MainUnitType[] getMainUnitType() {
        return MainUnitType.values();
    }
}
