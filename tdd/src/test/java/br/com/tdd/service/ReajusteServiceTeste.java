package br.com.tdd.service;

import br.com.tdd.enums.Desempenho;
import br.com.tdd.model.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTeste {

    private ReajusteService serviceTeste;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar(){
        this.serviceTeste = new ReajusteService();
         this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    void rejajusteDeveriaSerTresPorcentoQuandoDesempenhoForADesejar(){
        serviceTeste.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    void rejajusteDeveriaSerQuinzePorcentoQuandoDesempenhoForBom(){

        serviceTeste.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void rejajusteDeveriaSerVintePorcentoQuandoDesempenhoForOtimo(){

        serviceTeste.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
