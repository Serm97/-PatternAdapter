package back.vehiculobase;

public class Carroza {

    private void moverRiendas() {
        System.out.println("Moviendo riendas...");
    }

    public void halarRiendas() {
        System.out.println("Halando...Frenando!!");
    }

    public void arrearCaballos() {
        moverRiendas();
        System.out.println("<<Arreando Caballos>>");
    }
}
