import facade.Facade;

public class App {
    public static void main(String[] args) throws Exception {
        Facade f = Facade.getObject();
        f.geraRecibo();
    }
}
