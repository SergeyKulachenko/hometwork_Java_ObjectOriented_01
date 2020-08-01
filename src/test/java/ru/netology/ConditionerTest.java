package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @ParameterizedTest
    @CsvSource({
            "IncreaseTemperatureFrom_0,0,1",
            "IncreaseTemperatureFrom_15,15,16",
            "IncreaseTemperatureFrom_max,25,25"
    })
    public void increaseCurrentTemperature(String name, int currentTemperature, int expected) {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void decreaseCurrentTemperature(String name, int maxTemperature,int minTemperature,
                                                        int currentTemperature, int expected) {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(minTemperature);
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}