package com.parmentier;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

public class CodingInterview1Test {

    @Test
    @Ignore
    public void should_return_a$bcd$(){
        CodingInterview1 codingInterview1 = new CodingInterview1();
        String replace = codingInterview1.replace("abcdb", 'b');

        Assertions.assertThat(replace).isEqualTo("a$cd$");

    }

    @Test
    public void should_return_recurrent_a$bcd$(){
        CodingInterview1 codingInterview1 = new CodingInterview1();
        String replace = codingInterview1.recurrentReplace("abcdb", 'b', 0);

        Assertions.assertThat(replace).isEqualTo("a$cd$");

    }

}
