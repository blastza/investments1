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
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(value = {View.Base.class})
    private Long contactId;
    @JsonView(value = {View.Base.class})
    private String email;
    @JsonView(value = {View.Base.class})
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
