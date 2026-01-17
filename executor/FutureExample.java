package org.hilos.app.executor;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del Thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
        };
        Future<?> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecución del método main ");

        System.out.println(resultado.isDone());
        System.out.println(resultado.get(7, TimeUnit.SECONDS));
        System.out.println(resultado.isDone());


    }
}
