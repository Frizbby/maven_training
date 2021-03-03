package fr.lernejo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class SampleTest {

    @Test
    void addition(){
        int num1 = 5;
        int num2 = 3;

        Sample sample = new Sample();
        int sum = sample.op(Sample.Operation.ADD,num1,num2);

        Assertions.assertThat(sum).as("Addition de 2 nombres").isEqualTo(8);
    }

    @Test
    void multiplication(){
        int num1 = 5;
        int num2 = 3;

        Sample sample = new Sample();
        int multi = sample.op(Sample.Operation.MULT,num1,num2);

        Assertions.assertThat(multi).as("Multiplication de 2 nombres").isEqualTo(15);
    }

}

