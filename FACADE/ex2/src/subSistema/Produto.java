package subSistema;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    public Produto() {
    }
    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + "]";
    }
}
