package com.quantity.measurement.controller;

import com.quantity.measurement.enumeration.MainUnitType;
import com.quantity.measurement.enumeration.UnitType;
import com.quantity.measurement.service.QuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuantityMeasurementController {

    @Autowired
    QuantityMeasurementService measurementService;

    @GetMapping("/quantity")
    public MainUnitType[] getUnitType() {
        return measurementService.getMainUnitType();
    }

    @GetMapping("/quantity/{unit}")
    public List<UnitType> getUnitType(@PathVariable MainUnitType unit) {
        return measurementService.getUnitType(unit);
    }
}
