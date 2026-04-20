package com.projeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    void testSomar() { assertEquals(10.0, calc.somar(5.0, 5.0)); }

    @Test
    void testSubtrair() { assertEquals(2.0, calc.subtrair(5.0, 3.0)); }

    @Test
    void testMultiplicar() { assertEquals(15.0, calc.multiplicar(3.0, 5.0)); }

    @Test
    void testDividir() { assertEquals(2.0, calc.dividir(10.0, 5.0)); }

    @Test
    void testFalhaProposital() {
        // Este teste foi feito para falhar conforme exigido na atividade.
        // Esperamos 100, mas a soma de 2+2 resultará em 4.
        assertEquals(100.0, calc.somar(2.0, 2.0), "Falha intencional para validar o CI");
    }
}