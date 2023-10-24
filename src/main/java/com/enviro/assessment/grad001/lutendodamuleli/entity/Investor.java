package com.enviro.assessment.grad001.lutendodamuleli.entity;

import com.enviro.assessment.grad001.lutendodamuleli.model.View;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "investor")
public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(value = {View.Base.class})
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_pers_id")
    @JsonView(value = {View.Base.class})
    private PersonalDetails personal;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")
    @JsonView(value = {View.Base.class})
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_con_id")
    @JsonView(value = {View.Base.class})
    private Contact contact;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "fk_invest_id", referencedColumnName = "id")
    @JsonView(value = {View.Base.class})
    private List<Product> products;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_invest_id", referencedColumnName = "id")
    @JsonView(value = {View.New.class})
    private List<WithdrawalRequest> withdrawalRequest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalDetails getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalDetails personal) {
        this.personal = personal;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<WithdrawalRequest> getWithdrawalRequest() {
        return withdrawalRequest;
    }

    public void setWithdrawalRequest(List<WithdrawalRequest> withdrawalRequest) {
        this.withdrawalRequest = withdrawalRequest;
    }
}
