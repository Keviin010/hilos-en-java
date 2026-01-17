package org.hilos.app.therads;

public class NombreThreads extends Thread {

    public NombreThreads(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del hilo " + getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
        }

        System.out.println("Finaliza el hilo");
    }
}
