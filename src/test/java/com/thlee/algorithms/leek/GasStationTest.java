package com.thlee.algorithms.leek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {

    @Test
    void canCompleteCircuit() {
        GasStation gasStation = new GasStation();
        int i = gasStation.canCompleteCircuit(
            new int[]{3, 1, 1},
            new int[]{1, 2, 2}
        );
        System.out.println(i);
    }
}