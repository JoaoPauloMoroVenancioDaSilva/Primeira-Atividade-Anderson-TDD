package com.acme.greeter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void NumerosDiferentes() { //Testar números diferentes postivos
        double num1 = 3;
        double num2 = 78;
        double num3 = 45;

        double [] esperado = {3, 45, 78};
        double [] resultante = Greeter.OrdenarNumeros(num1, num2, num3);

        assertArrayEquals(esperado, resultante, 0.01);
    }

    @Test
    public void NumerosNegativos() { //Testar números negativos
        double num1 = -5;
        double num2 = -3;
        double num3 = -6789;

        double [] esperado = {-6789, -5, -3};
        double [] resultante = Greeter.OrdenarNumeros(num1, num2, num3);

        assertArrayEquals(esperado, resultante, 0.01);
    }

    @Test
    public void NumerosIguais() { //Testar números iguais
        double num1 = 100;
        double num2 = 100;
        double num3 = 100;

        double [] esperado = {100, 100, 100};
        double [] resultante = Greeter.OrdenarNumeros(num1, num2, num3);

        assertArrayEquals(esperado, resultante, 0.01);
    }
}