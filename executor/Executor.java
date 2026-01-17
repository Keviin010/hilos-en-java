package org.hilos.app.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del Thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
        };
        executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecución del método main 1");
        executor.awaitTermination(2,TimeUnit.SECONDS);
        System.out.println("Continuando con la ejecución del método main 2");

    }
}
