package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PoliceTest {

    private Police police;

    @BeforeEach
    public void setUp(){
        police = new Police();
    }

    /*@BeforeAll
    public void setUp(){
        police = new Police();
    }*/

    @Test
    public void should_return_true_when_call_check_driver_given_20(){
        // given
        //Police police = new Police();
        Driver driver = new Driver(20);

        // when
        boolean result = police.checkDriver(driver);
        // then
        Assertions.assertEquals(result,true);
    }

    @Test
    public void should_return_true_when_call_check_driver_given_18(){
        //Police police = new Police();
        Driver driver = new Driver(18);

        // when
        boolean result = police.checkDriver(driver);
        // then
        Assertions.assertEquals(result,true);
    }
    @Test
    public void should_return_false_when_call_check_driver_given_16(){
        //Police police = new Police();
        Driver driver = new Driver(16);

        // when
        boolean result = police.checkDriver(driver);
        // then
        Assertions.assertEquals(result,false);
    }

}