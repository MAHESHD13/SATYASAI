package com.sathya;

import org.springframework.stereotype.Component;

@Component
public class AddressBean {
    private String hno;
    private String cityName;
    private String state;

    // PUBLIC DEFAULT CONSTRUCTOR

    public AddressBean() {
        super();
    }

    // PUBLIC SETTERS AND GETTERS

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressBean [hno=" + hno + ", cityName=" + cityName + ", state=" + state + "]";
    }
}
