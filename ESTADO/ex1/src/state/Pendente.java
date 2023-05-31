package state;

public class Pendente implements State{
    private String nome = "Pendente";
    private Tarefa tarefa;
    public Pendente(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        tarefa.setEstado(new Atrasado(this.tarefa));
    }

    @Override
    public void concluida() {
        tarefa.setEstado(new Concluido(this.tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Tarefa já está no estado de pendente");
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pendente [nome=" + nome + "]";
    }    
    
}
