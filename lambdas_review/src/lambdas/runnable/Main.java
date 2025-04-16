package lambdas.runnable;

public class Main {
    public static void main(String[] args) {
        /*
        *  No recibe ningun valor y no retorna nada, solo ejecuta una tarea
        * */

        Runnable test = () -> {
            System.out.println("Ejecutando tareaaaa");
        };

        test.run();
    }
}
