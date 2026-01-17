package org.hilos.app;

import org.hilos.app.therads.NombreThreads;

public class AppExtenderThread {

    public static void main(String[] args) throws InterruptedException {

        NombreThreads hilo = new NombreThreads("Luis Carlos");

        hilo.start();

        Thread.sleep(100);

        System.out.println("Estado del hilo: " + hilo.getState());
    }
}
