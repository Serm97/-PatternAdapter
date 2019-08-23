package back.vehiculomodificado;

import back.Carro;
import back.vehiculobase.TroncoMovil;

public class TroncoMovilAdaptado extends Carro {

    final TroncoMovil troncoMovil = new TroncoMovil();

    @Override
    public void frenar() {
        troncoMovil.rozarPies();
    }

    @Override
    public void acelerar() {
        troncoMovil.correr();
    }
}
