package br.com.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    @Test
    public void deveriaSomarDoisNumerosPositovos(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(1,2);

        Assertions.assertEquals(3, soma);
    }
}
