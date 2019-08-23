package back.vehiculomodificado;

import back.Carro;
import back.vehiculobase.Carroza;

public class CarrozaModificada extends Carro {

    final Carroza carroza = new Carroza();

    @Override
    public void frenar() {
        carroza.halarRiendas();
    }

    @Override
    public void acelerar() {
        carroza.arrearCaballos();
    }
}
