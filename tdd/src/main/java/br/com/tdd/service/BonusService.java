package br.com.tdd.service;

import br.com.tdd.model.Funcionario;

import java.math.BigDecimal;

public class BonusService {
    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            throw  new IllegalArgumentException("Funcionario com salario mais que R$10000");
        }
        return valor;
    }
}
