
import static java.time.Clock.system;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Villa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        // Creamos un array de Cartas desordenado
        Carta[] mano = {
            new Carta(3, "Corazones"),
            new Carta(10, "Diamantes"),
            new Carta(7, "Corazones"),
            new Carta(2, "Treboles"),
            new Carta(10, "Corazones")
                
        };
        
        // Ordenamos la mano utilizando el algoritmo de burbuja
        ordenarPorBurbuja(mano);
        // Mostramos la mano ordenada
        System.out.println("Mano ordenada:");
        for (Carta carta : mano) {
            System.out.println(carta.getValor() + " de " + carta.getPalo());
        }
    }
    
    public static void ordenarPorBurbuja(Carta[] mano) {
        int n = mano.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                // Comparamos el valor y palo de las cartas para ordenar
                if (mano[j].getValor() > mano[j + 1].getValor() ||
                   (mano[j].getValor() == mano[j + 1].getValor() &&
                    mano[j].getPalo().compareTo(mano[j + 1].getPalo()) > 0)) {
                    
                    // Intercambiamos las cartas si están en el orden incorrecto
                    Carta temp = mano[j];
                    mano[j] = mano[j + 1];
                    mano[j + 1] = temp;
                }
            }
        }
    }
    
    public static void mostrarcartas() {
            System.out.println("Mostrar los libros ordenados alfabeticamente:");
        Iterable<String> carta = null;
            for (String cartas : carta) {
                System.out.println(cartas);
            }
        }
}
    



