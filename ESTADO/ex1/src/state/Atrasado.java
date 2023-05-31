package state;

public class Atrasado implements State {
    private String nome = "Atrasada";
    private Tarefa tarefa;

    public Atrasado(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println("Tarefa já esta atrasada");
    }

    @Override
    public void concluida() {
        tarefa.setEstado(new Concluido(this.tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Tarefa atrasada não pode ir para o estado pendente");
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Atrasado [nome=" + nome + "]";
    }  
}
