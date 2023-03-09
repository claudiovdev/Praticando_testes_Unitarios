package br.com.tdd.service;

import br.com.tdd.enums.Desempenho;
import br.com.tdd.model.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {

        if(desempenho == Desempenho.A_DESEJAR) {
           var reajuste =  funcionario.getSalario().multiply(new BigDecimal("0.03"));
           funcionario.reajustarSalario(reajuste);
        }else if(desempenho == Desempenho.BOM){
            var reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
            funcionario.reajustarSalario(reajuste);
        }else {
            var reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
            funcionario.reajustarSalario(reajuste);
        }
    }

}
