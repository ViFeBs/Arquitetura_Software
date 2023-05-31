package subSistema;

import java.util.ArrayList;
import java.util.List;

public final class Base {
    protected static List<Cliente> lstCliente = new ArrayList<>();
    protected static List<Gerente> lstGerente = new ArrayList<>();
    protected static List<Projeto> lstProjeto = new ArrayList<>();

    public static void inserir(){
        lstCliente.add(new Cliente("Roberto", 123));
        lstCliente.add(new Cliente("Carla", 445));
        lstProjeto.add(new Projeto(125, "PI 4", "06/02/2023", "26/06/2023"));
        lstProjeto.add(new Projeto(125, "PI 5", "06/02/2024", "26/06/2024"));
    } 
}
