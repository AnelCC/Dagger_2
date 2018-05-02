package com.anelcalvo.www.dagger_2.di;

import com.anelcalvo.www.dagger_2.di.House;

/**
 * Created by ctsuser1 on 5/2/18.
 */

public class Starks implements House {
    @Override
    public void prepareForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }
}
