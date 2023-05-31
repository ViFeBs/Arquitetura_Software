package state;

public class Correndo implements State{
    private String nome="posicao_correndo.png";
    private Personagem p;

    public Correndo(Personagem p) {
        this.p = p;
    }

    @Override
    public void pulando() {
        this.p.setPosicao(new Pulando(p));
    }

    @Override
    public void esperando() {
        this.p.setPosicao(new Esperando(p));
    }

    @Override
    public void abaixando() {
        this.p.setPosicao(new Abaixando(p));
    }

    @Override
    public void correndo() {
        System.out.println("Personagem ja está Correndo");
    }

    @Override
    public String toString() {
        return "Esperando [nome=" + nome + "]";
    }
}
