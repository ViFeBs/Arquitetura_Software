package state;

public class Concluido implements State {
    private String nome = "Concluido";
    private Tarefa tarefa;

    public Concluido(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println("Tarefa concluida não pode ir para o estado atrasada");
    }

    @Override
    public void concluida() {
        System.out.println("Tarefa já está no estado de concluida");
    }

    @Override
    public void pendente() {
        tarefa.setEstado(new Pendente(this.tarefa));
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Concluido [nome=" + nome + "]";
    }  
    
}
