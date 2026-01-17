package org.hilos.app.Sync;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public synchronized void  hornear (String masa){
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.pan = masa;
        System.out.println("Panadero: he horneado → " + this.pan);
        this.disponible = true;
        notify();
    }

    public synchronized String consumir(){
        while (!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Cliente: ha consumido → " + this.pan);
        this.disponible =false;
        notify();
        return pan;
    }
}
