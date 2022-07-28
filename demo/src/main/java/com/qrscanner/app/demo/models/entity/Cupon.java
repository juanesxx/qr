package com.qrscanner.app.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cupones")
public class Cupon implements Serializable{
    
    @Id
    private Long placa;

    private String descuento;
    private String person;
    private String city;
    public Long getPlaca() {
        return placa;
    }
    public void setPlaca(Long placa) {
        this.placa = placa;
    }
    public String setDescuento() {
        return descuento;
    }
    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }
    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    
    

}
