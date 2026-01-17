package org.hilos.app.Sync.runnable;

import org.hilos.app.Sync.Panaderia;

public class Cliente implements Runnable{
    private Panaderia panaderia;

    public Cliente(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            panaderia.consumir();
        }
    }
}
