import java.util.Scanner;

public class ejercicio1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.print("ingrese el primer numero: ");
      double num1 = scanner.nextDouble();
      System.out.print("ingrese el segundo numero:");
      scanner.close();
      double num2 = scanner.nextDouble();
      if (num1 > num2){
        double suma = num1 + num2;
        double diferencia = num1 - num2;
        System.out.println("el primer numero es mayor que el segundo. "); 
        System.out.println("Suma: " + suma);    
        System.out.println("Diferencia: " + diferencia);
      } else {
        double producto = num1 * num2;
        if (num2 != 0) {
          double division =  num1 / num2;
          System.out.println("el primer numero no es mayor que el segundo. ");
          System.out.println("Producto: " + producto);
          System.out.println("Division: " + division);
        } else {
          System.out.println("no se puede dividir por cero. ");
        }
      } 
    }
}