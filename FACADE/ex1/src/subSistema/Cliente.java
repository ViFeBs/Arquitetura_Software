package subSistema;

public class Cliente {
    private String nome;
    private long id;

    public Cliente(){}

    public Cliente(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public Cliente pesquisarCliente(long id){
        for(Cliente c: Base.lstCliente){
            if(id == c.getId()){
                return c;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", id=" + id + "]";
    }

}
