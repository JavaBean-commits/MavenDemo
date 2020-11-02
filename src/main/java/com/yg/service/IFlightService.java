package com.yg.service;

import java.util.Date;
import java.util.Map;

public interface IFlightService {
    Map<String,Object> QueryFlight(Date takeDate, String takeCity, String arriveCity);
}
