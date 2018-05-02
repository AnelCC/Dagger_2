package com.anelcalvo.www.dagger_2;

import com.anelcalvo.www.dagger_2.di.Boltons;
import com.anelcalvo.www.dagger_2.di.Starks;

/**
 * Created by anel.calvo on 5/2/18.
 */

public class BattleOfBastards {

    //Dependency injection is a technique whereby one object supplies the dependencies of another object.
    // A dependency is an object that can be used (a service). An injection is the passing of a dependency
    // to a dependent object (a client) that would use it. The service is made part of the client’s state.
    // Passing the service to the client, rather than allowing a client to build or find the service,
    // is the fundamental requirement of the pattern.(source)
    public static void main(String[] args){

        Starks starks = new Starks();
        Boltons boltons = new Boltons();

        War war = new War(starks,boltons);
        war.prepare();
        war.report();
    }
}
