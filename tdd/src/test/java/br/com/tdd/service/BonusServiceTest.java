package br.com.tdd.service;

import br.com.tdd.model.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaSalarioAlto(){
        BonusService bonusService = new BonusService();

       var bonus =  bonusService.calcularBonus(new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(25000)));

        assertEquals(BigDecimal.ZERO, bonus);

    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario(){
        BonusService bonusService = new BonusService();

        var bonus =  bonusService.calcularBonus(new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(2500)));

        assertEquals(new BigDecimal("250.0"), bonus);

    }

    @Test
    void bonusDeveriaSerDezPorcentoParaSalarioDeMil(){
        BonusService bonusService = new BonusService();

        var bonus =  bonusService.calcularBonus(new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(10000)));

        assertEquals(new BigDecimal("1000.0"), bonus);

    }
}
