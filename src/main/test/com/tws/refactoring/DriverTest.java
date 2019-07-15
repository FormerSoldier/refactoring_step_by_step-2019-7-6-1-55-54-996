package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DriverTest {
    private Driver driver;

    @BeforeEach
    public void init(){
        driver = new Driver();
    }


    @Test
    public void should_return_true_when_call_is_legal_driver_given_20(){
        // given
        driver.setAge(20);
        // when
        boolean result = driver.isLegalDriver();

        // then
        Assertions.assertEquals(result,true);
    }

    @Test
    public void should_return_true_when_call_is_legal_driver_given_18(){
        // given
        driver.setAge(18);

        // when
        boolean result = driver.isLegalDriver();

        // then
        Assertions.assertEquals(result,true);
    }
    @Test
    public void should_return_false_when_call_is_legal_driver_given_16(){
        // given
        driver.setAge(16);

        // when
        boolean result = driver.isLegalDriver();
        // then
        Assertions.assertEquals(result,false);
    }

}