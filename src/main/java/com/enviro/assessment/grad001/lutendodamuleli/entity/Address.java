package com.enviro.assessment.grad001.lutendodamuleli.entity;

import com.enviro.assessment.grad001.lutendodamuleli.model.View;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(value = {View.Base.class})
    private Long addressId;
    @JsonView(value = {View.Base.class})
    private String firstLine;
    @JsonView(value = {View.Base.class})
    private String secondLind;
    @JsonView(value = {View.Base.class})
    private String city;
    @JsonView(value = {View.Base.class})
    private String zipCode;

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLind() {
        return secondLind;
    }

    public void setSecondLind(String secondLind) {
        this.secondLind = secondLind;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
