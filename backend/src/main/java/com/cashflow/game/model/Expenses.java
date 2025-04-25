package com.cashflow.game.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Expenses {

    private Float taxes;
    private Float mortgage;
    private Float school;
    private Float car;
    private Float credit;
    private Float retail;
    private Float other;
    private Float child;

    public Expenses() {
    }

    public Expenses(Float taxes, Float mortgage, Float school, Float car, Float credit, Float retail, Float other, Float child) {
        this.taxes = taxes;
        this.mortgage = mortgage;
        this.school = school;
        this.car = car;
        this.credit = credit;
        this.retail = retail;
        this.other = other;
        this.child = child;
    }

    public Float getTaxes() {
        return taxes;
    }

    public void setTaxes(Float taxes) {
        this.taxes = taxes;
    }

    public Float getMortgage() {
        return mortgage;
    }

    public void setMortgage(Float mortgage) {
        this.mortgage = mortgage;
    }

    public Float getSchool() {
        return school;
    }

    public void setSchool(Float school) {
        this.school = school;
    }

    public Float getCar() {
        return car;
    }

    public void setCar(Float car) {
        this.car = car;
    }

    public Float getCredit() {
        return credit;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public Float getRetail() {
        return retail;
    }

    public void setRetail(Float retail) {
        this.retail = retail;
    }

    public Float getOther() {
        return other;
    }

    public void setOther(Float other) {
        this.other = other;
    }

    public Float getChild() {
        return child;
    }

    public void setChild(Float child) {
        this.child = child;
    }
}
