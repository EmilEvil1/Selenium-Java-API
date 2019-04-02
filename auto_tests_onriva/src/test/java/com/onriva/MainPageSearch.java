package com.onriva;

import org.junit.Test;
public class MainPageSearch extends ConfigurationFunc {

    @Test
    public void roundTrip() {
        searchRoundTrip("NYC","PAR");
    }

    @Test
    public void oneWay() {
        searchOneWay("LOS","LON");
    }

    @Test
    public void multiCity() {
        multyCity("RIO","MOS","heL","yea");
    }

}
