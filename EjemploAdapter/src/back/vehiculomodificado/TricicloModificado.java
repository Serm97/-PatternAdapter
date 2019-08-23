package back.vehiculomodificado;

import back.Carro;
import back.vehiculobase.Triciclo;

public class TricicloModificado extends Carro {

    final Triciclo triciclo = new Triciclo();

    @Override
    public void frenar() {
        triciclo.rozarPies();
    }

    @Override
    public void acelerar() {
        triciclo.pedalear();
    }
}
