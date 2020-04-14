package com.quantity.measurement.controller;

import com.quantity.measurement.enumeration.MainUnitType;
import com.quantity.measurement.service.QuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuantityMeasurementController {

    @Autowired
    QuantityMeasurementService measurementService;

    @GetMapping("/quantity")
    public MainUnitType[] getUnitType() {
        return measurementService.getMainUnitType();
    }
}
