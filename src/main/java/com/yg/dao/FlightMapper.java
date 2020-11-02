package com.yg.dao;

import com.yg.pojo.Flight;
import com.yg.pojo.FlightInfo;

import java.util.Date;
import java.util.List;

public interface FlightMapper {
    /**
     * 根据条件查询航班信息
      * @param takeDate 出发日期
     * @param takeCity 出发城市
     * @param arriveCity 到达城市
     * @return 航班信息
     */
    List<FlightInfo> QueryFlight(Date takeDate, String takeCity, String arriveCity, Date takeTime);

}
