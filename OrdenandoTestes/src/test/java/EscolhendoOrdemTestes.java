import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.Random.class)
public class EscolhendoOrdemTestes {

    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(false);
    }

}
