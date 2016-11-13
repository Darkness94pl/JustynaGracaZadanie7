package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USLUGI")
public class UslugiEntity {
     
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;

    @Column(name="NAZWA")
    private String nazwa;

    @Column(name="KOSZT")
    private Double koszt;
 
    @Column(name="RODZAJ")
    private String rodzaj;
 
    @Column(name="OPIS")
    private String opis;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {this.id = id;}

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
}

    public Double getKoszt() {
        return koszt;
    }
    public void setKoszt(Double koszt) {
        this.koszt = koszt;
    }

    public String getRodzaj() {
        return rodzaj;
    }
    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getOpis() {
        return opis;
    }
    public void setOpis(String opis) {
        this.opis = opis;
    }
}