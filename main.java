import Lista.ListaDeCompras;
import Opciones.ListaOpciones;
import Programas.IMC;
import interfaz_grafica.Banner;
import matematicas.Mate;
import conversor.conversiones;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


                //lista de opciones
                String[] listaDeOpciones = {
                        "Calculadora", "IMC",
                        "Farenheit / Celsius", "Calcular edad",
                        "Grados", "Opción_6",
                        "Opción_7", "Opción_8",
                        "Opción_9", "Salir" };

                boolean programas= true;
                do {
                    Banner.msj();
                    ListaOpciones.CargarOpciones();
                    System.out.print("[?]: ");
                    Scanner scanner = new Scanner(System.in);
                    int opcion = scanner.nextInt();
                    System.out.println("-----------------------------------------------");

                    switch (opcion) {

                        case 1:
                            Mate.matem();
                            break;
                        case 2:

                            IMC.ProgramaIMC();
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                           
                            ListaDeCompras.programa();
                        case 10:
                            programas = false;
                            break;
                    }
                }while (programas);

            }
        }


