package padroesestruturais.composite;

public class Acai {

    private Conteudo adicionais;

    public void setAdicionais(Conteudo adicionais) {
        this.adicionais = adicionais;
    }

    public String getAdicionais() {
        if (this.adicionais == null) {
            throw new NullPointerException("Acai sem adicionais");
        }
        return this.adicionais.getConteudo();
    }
}
