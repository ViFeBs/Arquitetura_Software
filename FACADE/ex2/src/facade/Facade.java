package facade;

import java.util.ArrayList;
import java.util.List;

import subSistema.Cliente;
import subSistema.Endereco;
import subSistema.Produto;

public class Facade {
    private static Facade facade = new Facade();

    private Facade(){}
   
    public static Facade getObject(){
        if (facade == null) {
            return facade=new Facade();
        } else {
            return facade;
        }

    }

    public void geraRecibo(){
        Endereco e = new Endereco("Rua Amelia Petrela", 21);
        List<Produto> lstProduto = listaProdutos();
        Cliente c = new Cliente("Bruno", e, lstProduto);
        System.out.println(c.toString());
    }

    public List<Produto> listaProdutos(){
        List<Produto> lstProduto = new ArrayList<>();
        lstProduto.add(new Produto("Leite", "Alimento", 15.60));
        lstProduto.add(new Produto("Bife", "Alimento", 60.50));
        lstProduto.add(new Produto("Escova de Dentes", "Objeto", 5.60));

        return lstProduto;
    }
}
