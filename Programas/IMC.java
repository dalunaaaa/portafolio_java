package Programas;
import java.util.Scanner;

public class IMC {
public static double CalcularIMC (double peso, double altura){
    double IMC = peso /(altura*altura);
    return IMC;
}
public static void ProgramaIMC(){
    Scanner entradaDeDatos = new Scanner(System.in);
    System.out.println("peso :");
    double peso = entradaDeDatos.nextDouble();
    System.out.println("altura:");
    double altura = entradaDeDatos.nextDouble();

    double IMC = CalcularIMC(peso,altura);
}

}
