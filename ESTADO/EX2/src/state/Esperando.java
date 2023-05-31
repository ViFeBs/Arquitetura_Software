package state;

public class Esperando implements State{
    private String nome="posicao_esperando.png";
    private Personagem p;

    public Esperando(Personagem p) {
        this.p = p;
    }

    @Override
    public void pulando() {
        this.p.setPosicao(new Pulando(p));
    }

    @Override
    public void esperando() {
        System.out.println("Personagem ja está esperando");
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
