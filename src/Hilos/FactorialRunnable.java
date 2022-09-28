
package Hilos;

public class FactorialRunnable {
    public static void main(String[] args) {
        Integer[] array ;
        array = new Integer[args.length];
        for(int i = 0; i < args.length; i++){
            array[i] = Integer.parseInt(args[i]);
        }
        Thread h1 = new Thread(new FactorialThread(array));
        Thread h2 = new Thread(new FactorialThread(array));
        h1.setName("Hilo 1 = ");
        h2.setName("Hilo 2 = ");
        h1.start();
        h2.start();
    }
}
