package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoasTest {
    @BeforeAll
    static void configuraConexao(){
        BancoDados.iniciarConexao();
    }
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDados.insereDados(new Pessoa("Dyorgenes", LocalDate.of(2003,6,12)));
    }
    @AfterEach
    void removeDadosDoTeste(){
        BancoDados.removeDados(new Pessoa("Dyorgenes", LocalDate.of(2003,6,12)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDados.finalizarConexao();
    }
}
