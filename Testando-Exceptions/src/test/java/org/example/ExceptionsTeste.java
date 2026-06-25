package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    @Test
    void validarCenarioDeExececaoNaTransferencia(){
         Conta contaOrigem = new Conta("123456",0);
         Conta contaDestino = new Conta("45678",100);

         TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() ->
                transferenciaEntreContas.transfere(contaOrigem,contaDestino,-1));
    }
}
