package org.hilos.app.Sync;

import org.hilos.app.Sync.runnable.Cliente;
import org.hilos.app.Sync.runnable.Panadero;

public class AppPanaderia {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Cliente(p)).start();

    }
}
