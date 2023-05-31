package subSistema;

public class Projeto {
    private int id;
    private String nome;
    private String dtInicio;
    private String dtFim;
        
    public Projeto() {}

    public Projeto(int id, String nome, String dtInicio, String dtFim) {
        this.id = id;
        this.nome = nome;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }

    @Override
    public String toString() {
        return "Projeto [id=" + id + ", nome=" + nome + ", dtInicio=" + dtInicio + ", dtFim=" + dtFim + "]";
    }

    public Projeto pesquisarProjeto(long id){
        for(Projeto p: Base.lstProjeto){
            if(id == p.getId()){
                return p;
            }
        }
        return null;
    }
   
   
}
