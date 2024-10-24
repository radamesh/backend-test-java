package com.backend.test.java.controller;

import com.backend.test.java.entity.ParkingRecord;
import com.backend.test.java.service.parking.ParkingService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.mockito.Mockito.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ParkingController.class)
public class ParkingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ParkingService parkingService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateParking() throws Exception {
        ParkingRecord parkingRecord = new ParkingRecord();
        parkingRecord.setVehicle("kombi");
        parkingRecord.setPlate("XXX-1980");
        parkingRecord.setEstablishment("Establishment A");

        when(parkingService.registerEntry(any(ParkingRecord.class)))
                .thenReturn(parkingRecord);

        mockMvc.perform(post("/api/parking/entry")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(parkingRecord)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.vehicle").value("kombi"))
                .andExpect(jsonPath("$.establishment").value("Establishment A"));

        verify(parkingService, times(1)).registerEntry(any(ParkingRecord.class));
    }
}
