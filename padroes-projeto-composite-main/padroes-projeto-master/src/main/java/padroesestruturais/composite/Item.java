package padroesestruturais.composite;

public class Item extends Conteudo {

    private String nome;

    public Item(String descricao, String nome) {
        super(descricao);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return "Item: " + this.getDescricao() + " - " + this.nome + "\n";
    }
}
