package com.anelcalvo.www.dagger_2;

import com.anelcalvo.www.dagger_2.di.Boltons;
import com.anelcalvo.www.dagger_2.di.Starks;

/**
 * Created by ctsuser1 on 5/2/18.
 */

//In an application that relies on dependency injection,
// the objects never have to hunt around for dependencies
// or construct them themselves. All the dependencies are
// provided to them or injected into them so that they
// are ready to be used.
public class War {
    private Starks starks;
    private Boltons boltons;

    //DI - getting dependencies from else where via constructor
    public War(Starks starks, Boltons bolton) {
        this.starks = starks;
        this.boltons = bolton;
    }

    public void prepare() {
        starks.prepareForWar();
        boltons.prepareForWar();
    }

    public void report() {
        starks.reportForWar();
        boltons.reportForWar();
    }
}
