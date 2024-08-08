package br.com.ceub.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void somaDoisInteiros() {
        // Prepare
        Calculadora calculadora = new Calculadora();

        // Execute
        int resultado = calculadora.soma(1,3);

        // Assert
        assertEquals(4, resultado);
    }

    @Test
    public void somaDoisZeros() {
        // Prepare
        Calculadora calculadora = new Calculadora();

        // Execute
        int resultado = calculadora.soma(0,0);

        // Assert
        assertEquals(0, resultado);
    }

    @Test
    public void somaZeroEMaisUm() {
        // Prepare
        Calculadora calculadora = new Calculadora();

        // Execute
        int resultado = calculadora.soma(0,7);

        // Assert
        assertEquals(7, resultado);
    }
}