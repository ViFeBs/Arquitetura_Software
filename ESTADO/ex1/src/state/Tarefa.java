package state;

public class Tarefa {
    private String nome;
    private String descricao;
    private State estado = new Pendente(this);
    private static Tarefa tarefa;

    private Tarefa(){}
   
    public static Tarefa getObject(String nm, String desc){
        if (tarefa == null) {
            return tarefa=new Tarefa(nm,desc);
        } else {
            return tarefa;
        }

    }
    private Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public State getEstado() {
        return estado;
    }
    
    public void setEstado(State estado) {
        this.estado = estado;
    }
    
    public void requisitarAtrasada(){
        this.estado.atrasada();
    }

    public void requisitarConcluida(){
        this.estado.concluida();
    }

    public void requisitarPendente(){
        this.estado.pendente();
    }

    @Override
    public String toString() {
        return "Tarefa [nome=" + nome + ", descricao=" + descricao + " , estado="+ estado.toString() +"]";
    }

}
