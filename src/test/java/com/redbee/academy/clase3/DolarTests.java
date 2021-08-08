package com.redbee.academy.clase3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DolarTests {

    @Test
    void testDolar() {
        Assertions.assertEquals(
                3.33,
                Dolar.resolver(
                        Arrays.asList(
                                496.96F,
                                499.03F,
                                496.03F,
                                493.27F,
                                488.82F,
                                492.16F,
                                490.32F,
                                490.67F,
                                490.89F,
                                494.10F))
        );
    }
}
