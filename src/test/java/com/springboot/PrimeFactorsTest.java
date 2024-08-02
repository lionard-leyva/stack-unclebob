package com.springboot;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PrimeFactorsTest {
    @Test
    void factors() throws Exception {
        assertThat(factorOf(1), is(empty()));
        assertThat(factorOf(2), contains(2));
        assertThat(factorOf(3), contains(3));
        assertThat(factorOf(4), contains(2, 2));
        assertThat(factorOf(6), contains(2, 3));
        assertThat(factorOf(7), contains(7));
        assertThat(factorOf(8), contains(2, 2, 2));


    }

    private List<Integer> factorOf(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (n > 1) {
            while (n % 2 == 0) {
                factors.add(2);
                n /= 2;
            }
        }
        if (n > 1)
            factors.add(n);


        return factors;
    }
}
