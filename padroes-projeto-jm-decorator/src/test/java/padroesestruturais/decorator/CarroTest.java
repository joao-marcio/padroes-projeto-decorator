package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarroTest {

    @Test
    void deveRetornarPrecoCarro() {
        Carro carro = new Punto(50000);

        assertEquals(50000, carro.getPreco());
    }

    @Test
    void deveRetornarPrecoComAerofolio() {
        Carro carro = new Aerofolio(new Punto(50000));

        assertEquals(50800, carro.getPreco());
    }

    @Test
    void deveRetornarPrecoComNeon() {
        Carro carro = new Neon(new Punto(50000));

        assertEquals(51200, carro.getPreco());
    }

    @Test
    void deveRetornarPrecoComAerofolioNeon() {
        Carro carro = new Aerofolio(new Neon (new Punto(50000)));


        assertEquals( 52000, carro.getPreco());
    }


    @Test
    void deveRetornarCustomCarro() {
        Carro carro = new Punto();

        assertEquals("Punto", carro.getCustom());
    }

    @Test
    void deveRetornarCustomAerofolio() {
        Carro carro = new Aerofolio(new Punto());

        assertEquals("Punto/Aerofolio", carro.getCustom());
    }

    @Test
    void deveRetornarCustomNeon() {
        Carro carro = new Neon(new Punto());

        assertEquals("Punto/Neon", carro.getCustom());
    }

    @Test
    void deveRetornarCustomComAerofolioNeon() {
        Carro carro = new Aerofolio(new Neon (new Punto()));


        assertEquals( "Punto/Neon/Aerofolio", carro.getCustom());
    }


}