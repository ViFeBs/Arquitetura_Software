import state.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem p = new Personagem("Roberto", 10);

        p.Abaixar();
        System.out.println(p.getPosicao().toString());

        p.Esperar();
        System.out.println(p.getPosicao().toString());

        p.Pular();
        System.out.println(p.getPosicao().toString());

        p.Correr();
        System.out.println(p.getPosicao().toString());

    }
}
