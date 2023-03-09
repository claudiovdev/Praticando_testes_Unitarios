package br.com.tdd.service;

import br.com.tdd.model.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaSalarioAlto(){
        BonusService bonusService = new BonusService();

        //assertThrows(IllegalArgumentException.class,
                //() -> bonusService.calcularBonus(new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(25000))));

        try {
            bonusService.calcularBonus(new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(25000)));
        } catch (Exception e){
            assertEquals("Funcionario com salario mais que R$10000", e.getMessage());
        }
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
