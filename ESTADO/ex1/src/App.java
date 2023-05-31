import state.Tarefa;

public class App {
    public static void main(String[] args) throws Exception {
        Tarefa t = Tarefa.getObject("Roberto", "Fazer PI");
        t.requisitarAtrasada();
        System.out.println(t.toString());
        t.requisitarConcluida();
        System.out.println(t.toString());
        t.requisitarPendente();
        System.out.println(t.toString());
        t.requisitarConcluida();
        System.out.println(t.toString());
        t.requisitarConcluida();
        System.out.println(t.toString());

    }
}
