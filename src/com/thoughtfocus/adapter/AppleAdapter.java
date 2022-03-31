package com.thoughtfocus.adapter;

public class AppleAdapter implements Chargeable{
    Charger samsungCharger;

    public void setSamsungCharger(Charger samsungCharger){
        this.samsungCharger = samsungCharger;
    }

    @Override
    public void setMobileName(String mobileName) {

    }
    @Override
    public void charge() {
        samsungCharger.supplyCharge();

    }
}
