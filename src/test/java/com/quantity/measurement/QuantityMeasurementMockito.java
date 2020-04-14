package com.quantity.measurement;


import com.quantity.measurement.controller.QuantityMeasurementController;
import com.quantity.measurement.enumeration.MainUnitType;
import com.quantity.measurement.service.QuantityMeasurementService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static com.quantity.measurement.enumeration.MainUnitType.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuantityMeasurementController.class)
public class QuantityMeasurementMockito {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private QuantityMeasurementService service;

    @Test
    public void givenEmployees_whenGetEmployees_thenReturnJsonArray() throws Exception {
        MainUnitType[] expectedResult = {LENGTH, MASS, VOLUME, TEMPERATURE};
        given(service.getMainUnitType()).willReturn(expectedResult);
        mvc.perform(get("/quantity"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(Arrays.toString(expectedResult)));
    }
}