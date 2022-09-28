package Hilos;

public class FactorialThread implements Runnable {

    Integer[] array;

    public FactorialThread(Integer[] F) {
        this.array = F;
    }

    public void run() {
        int Factorial = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] > 0) {
                for (int j = 1; j < array[i]; j++) {
                    Factorial = Factorial * j;
                    if (Factorial < 0) {
                        Factorial = Factorial * -1;
                    }
                }
                System.out.println(Thread.currentThread().getName() + "El factorial del argumento con valor de " + array[i] + " es: " + Factorial);
            }
            if (array[i] == 0) {
                System.out.println(Thread.currentThread().getName() + "El factorial del argumento con valor de " + array[i] + " es: " + 1);
            }
            if (array[i] < 0) {
                System.out.println(Thread.currentThread().getName() + "El argumento con valor de " + array[i] + " no tiene factorial");
            }
        }

    }
}
