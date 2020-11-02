package com.yg.service.impl;

import com.yg.dao.FlightMapper;
import com.yg.pojo.FlightInfo;
import com.yg.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class FlightService implements IFlightService {
    @Autowired
    private FlightMapper flightMapper;
    @Override
    public Map<String, Object> QueryFlight(Date takeDate, String takeCity, String arriveCity) {
        Map<String,Object> resultMap=new HashMap<>();
        String msg="query success";
        String code="200";
        Date now=new Date();
        List<FlightInfo> flightInfo=flightMapper.QueryFlight(takeDate,takeCity,arriveCity,now);
        if(flightInfo==null){
            msg="query fail";
            code="500";
            resultMap.put("msg",msg);
            resultMap.put("code",code);
            return resultMap;
        }
        resultMap.put("msg",msg);
        resultMap.put("code",code);
        resultMap.put("flightInfo",flightInfo);
        return  resultMap;
    }
}
