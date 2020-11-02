package com.yg.pojo;

import java.util.Date;

/**
 * 航班信息
 */
public class FlightInfo {
    private String model;
    private Date takeTime;
    private Date arriveTime;
    private String takeSite;
    private String arriveSite;
    private Integer firstClass;
    private Integer economyclass;
    private Date takeDate;

    @Override
    public String toString() {
        return "FlightInfo{" +
                "model='" + model + '\'' +
                ", takeTime=" + takeTime +
                ", arriveTime=" + arriveTime +
                ", takeSite='" + takeSite + '\'' +
                ", arriveSite='" + arriveSite + '\'' +
                ", firstClass=" + firstClass +
                ", economyclass=" + economyclass +
                ", takeDate=" + takeDate +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(Date takeTime) {
        this.takeTime = takeTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getTakeSite() {
        return takeSite;
    }

    public void setTakeSite(String takeSite) {
        this.takeSite = takeSite;
    }

    public String getArriveSite() {
        return arriveSite;
    }

    public void setArriveSite(String arriveSite) {
        this.arriveSite = arriveSite;
    }

    public Integer getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(Integer firstClass) {
        this.firstClass = firstClass;
    }

    public Integer getEconomyclass() {
        return economyclass;
    }

    public void setEconomyclass(Integer economyclass) {
        this.economyclass = economyclass;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

    public FlightInfo(String model, Date takeTime, Date arriveTime, String takeSite, String arriveSite, Integer firstClass, Integer economyclass, Date takeDate) {
        this.model = model;
        this.takeTime = takeTime;
        this.arriveTime = arriveTime;
        this.takeSite = takeSite;
        this.arriveSite = arriveSite;
        this.firstClass = firstClass;
        this.economyclass = economyclass;
        this.takeDate = takeDate;
    }

    public FlightInfo() {
    }
}
