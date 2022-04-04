package com.thoughtfocus.structuraldesignpatterns.adapter;

import com.thoughtfocus.structuraldesignpatterns.adapter.Chargeable;

public class ChargerUtils {
    public static void doCharge(Chargeable chargeable){
        chargeable.charge();
    }
}
