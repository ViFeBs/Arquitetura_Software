package state;

public class Pulando implements State{
    private String nome="posicao_pulando.png";
    private Personagem p;

    public Pulando(Personagem p) {
        this.p = p;
    }

    @Override
    public void pulando() {
        System.out.println("Personagem ja está Pulando");
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
        this.p.setPosicao(new Correndo(p));
    }

    @Override
    public String toString() {
        return "Esperando [nome=" + nome + "]";
    }
}
