package sistema_de_supermercado;

public class Produto {
    private String nome;
    private double preco;
    private String validade;
    private static int codBarras;

    public Produto() {
    }

    public Produto(String nome, double preco, String validade) {
        Produto.codBarras++;
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }
    
    
}
