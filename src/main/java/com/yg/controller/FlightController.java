package com.yg.controller;

import com.yg.pojo.Flight;
import com.yg.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class FlightController {
    @Autowired
    private IFlightService flightService;

    @RequestMapping("/QueryFlight")
    public String QueryFlight(Map<String,Object> map, Flight flight){
        Date takeDate=flight.getTakeDate();
        String takeCity=flight.getTakeCity();
        String arriveCity=flight.getArriveCity();
        map=flightService.QueryFlight(takeDate,takeCity,arriveCity);
        return "index1";
    }
}
