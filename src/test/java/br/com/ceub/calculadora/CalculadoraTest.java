package br.com.ceub.calculadora;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {
    Calculadora calculadora;
    // Defina um delta pequeno para a comparação de floats
    private static final double DELTA = 1e-10;

    @Before
    public void setUp() throws Exception {
        calculadora = new Calculadora();
    }

    @Test
    public void somaDoisInteiros() {
        // Execute
        int resultado = calculadora.soma(1,3);

        // Assert
        assertEquals(4, resultado);
    }

    @Test
    public void somaDoisZeros() {
        // Execute
        int resultado = calculadora.soma(0,0);

        // Assert
        assertEquals(0, resultado);
    }

    @Test
    public void somaZeroEMaisUm() {
        // Execute
        int resultado = calculadora.soma(0,7);

        // Assert
        assertEquals(7, resultado);
    }

    @Test
    public void subtracao() {
        // Execute
        int resultado = calculadora.subtracao(5, 3);

        // Assert
        assertEquals(2, resultado);
    }

    @Test
    public void multiplicacao() {
        int resultado = calculadora.multiplicacao(3,4);

        assertEquals(12,resultado);
    }

    @Test
    public void divisao() {
        double resultado = calculadora.divisao(10, 2);
        assertEquals(5.0, resultado, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divisaoPorZeroDeveLancarException() {
        calculadora.divisao(10, 0);
    }

}