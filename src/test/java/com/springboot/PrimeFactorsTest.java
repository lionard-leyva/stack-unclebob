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
        assertThat(factorOf(9), contains(3, 3));


    }

    private List<Integer> factorOf(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (n > 1) {
            while (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
            divisor++;
        }
      return factors;
    }
}
