import Opciones.ListaOpciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {
    public static String[] opciones6 = {"lista de compras", "salir"};

    public static void programa() {
        ListaOpciones.CargarOpciones(opciones6);

        Scanner opcion = new Scanner(System.in);
        System.out.println("[?]: ");
        int r = opcion.nextInt();

        switch (r) {
            case 1:
                System.out.println("opcion1");
                break;
            case 2:
                System.out.println("salir");
                break;
        }

        if (r == 1) {
            crearLista();
        }
    }

    // Método para crear lista de compras
    public static void crearLista() {
        List<String> listaNombre = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();

        String rP;
        double rPc;
        for (int i = 1; i < 3; i++) {
            Scanner item = new Scanner(System.in);
            System.out.println("producto: ");
            rP = item.nextLine();
            System.out.println("precio :");
            rPc = item.nextDouble();

            listaNombre.add(rP);
            listaPrecio.add(rPc);
        }
        System.out.println(listaNombre);
    }
}

