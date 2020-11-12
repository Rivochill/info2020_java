import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scan.nextInt();
        scan.close();

        for(int i = 0; i <= 10 ; i++) {
                System.out.println(i + "x" + num + "=" + i*num);
            }

        }
    
}
