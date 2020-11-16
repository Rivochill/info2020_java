import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el rango de su calificación:(de 0 a 100) ");

        int range = scan.nextInt();
        String grade;

        if (range > 92){
            System.out.println("Exelente");
        } else if (range > 84){
            System.out.println("Sobresaliente");
        } else if (range > 74){
            System.out.println("Distinguido");
        } else if (range > 59){
            System.out.println("Bueno");
        } else {
            System.out.println("Desaprobado");
        }
    }
}
