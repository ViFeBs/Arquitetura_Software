package state;

public class Abaixando implements State {

    private String nome="posicao_abaixado.png";
    private Personagem p;

    public Abaixando(Personagem p) {
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
        System.out.println("Personagem ja está Abaixado");
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
