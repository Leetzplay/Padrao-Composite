package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcaiTest {

    @Test
    void deveRetornarAcai() {
        Nivel nivel1 = new Nivel("Primeira Nivel");
        Item item11 = new Item("Massa pronta", "Dona Benta");
        Item item12 = new Item("Suco Laranja", "Tang");
        nivel1.addConteudo(item11);
        nivel1.addConteudo(item12);

        Nivel nivel2 = new Nivel("Segunda Nivel");
        Item item21 = new Item("Leite Condensado", "Piracanjuba");
        Item item22 = new Item("Achocolatado", "Toddy");
        nivel2.addConteudo(item21);
        nivel2.addConteudo(item22);




        Nivel adicionais = new Nivel("Acai");
        adicionais.addConteudo(nivel1);
        adicionais.addConteudo(nivel2);


        Acai acai = new Acai();
        acai.setAdicionais(adicionais);

        assertEquals("Nivel: Acai\n" +
                "Nivel: Primeira Nivel\n" +
                "Item: Massa pronta - Dona Benta\n" +
                "Item: Suco Laranja - Tang\n" +
                "Nivel: Segunda Nivel\n" +
                "Item: Leite Condensado - Piracanjuba\n" +
                "Item: Achocolatado - Toddy\n", acai.getAdicionais());
    }

    @Test
    void deveRetornarExecacaoAcaiSemAdicionais() {
        try {
            Acai acai = new Acai();
            acai.getAdicionais();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Acai sem adicionaiss", e.getMessage());
        }
    }
}