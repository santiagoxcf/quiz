import java.util.Scanner;

public class ejercicio2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("ingrese la tercera nota: ");
        scanner.close();
        double nota3 = scanner.nextDouble();
        double promedio = (nota1+nota2+nota3)/3;
        if (promedio>=7) {
            System.out.println("promocionado");
        } else {
            System.out.println("No promocionado");
        } System.out.println("Promedio:" + promedio);
        
    }
}
