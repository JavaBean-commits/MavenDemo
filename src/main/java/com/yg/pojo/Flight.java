package com.yg.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 前段传过来的信息
 */
public class Flight {
    private String takeCity;
    private String arriveCity;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date takeDate;
    private Integer adultNum;
    private Integer childNum;
    private Integer babyNum;

    @Override
    public String toString() {
        return "Flight{" +
                "takeCity='" + takeCity + '\'' +
                ", arriveCity='" + arriveCity + '\'' +
                ", takeDate=" + takeDate +
                ", adultNum=" + adultNum +
                ", childNum=" + childNum +
                ", babyNum=" + babyNum +
                '}';
    }

    public String getTakeCity() {
        return takeCity;
    }

    public void setTakeCity(String takeCity) {
        this.takeCity = takeCity;
    }

    public String getArriveCity() {
        return arriveCity;
    }

    public void setArriveCity(String arriveCity) {
        this.arriveCity = arriveCity;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

    public Integer getAdultNum() {
        return adultNum;
    }

    public void setAdultNum(Integer adultNum) {
        this.adultNum = adultNum;
    }

    public Integer getChildNum() {
        return childNum;
    }

    public void setChildNum(Integer childNum) {
        this.childNum = childNum;
    }

    public Integer getBabyNum() {
        return babyNum;
    }

    public void setBabyNum(Integer babyNum) {
        this.babyNum = babyNum;
    }

    public Flight(String takeCity, String arriveCity, Date takeDate, Integer adultNum, Integer childNum, Integer babyNum) {
        this.takeCity = takeCity;
        this.arriveCity = arriveCity;
        this.takeDate = takeDate;
        this.adultNum = adultNum;
        this.childNum = childNum;
        this.babyNum = babyNum;
    }

    public Flight() {
    }
}
