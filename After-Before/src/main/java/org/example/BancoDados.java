package org.example;

import java.util.logging.Logger;

public class BancoDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("INICIOU A CONEXÃO");
    }
    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("FINALIZOU A CONEXÃO");
    }
    public static void insereDados(Pessoa pessoa){
        LOGGER.info("INSERIU DADOS");
    }
    public static void removeDados(Pessoa pessoa){
        LOGGER.info("REMOVEU DADOS");
    }
}
