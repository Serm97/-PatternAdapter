package back.vehiculobase;

public class TroncoMovil {

    private void bajarPies(){
        System.out.println("Pies en el piso...");
    }

    public void rozarPies() {
        bajarPies();
        System.out.println("Pies arrastrandosé en el piso!!");
    }

    public void correr(){
        bajarPies();
        System.out.println("<<Corriendo con el TroncoMovil>>");
    }
}
