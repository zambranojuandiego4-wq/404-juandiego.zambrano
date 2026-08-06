import javax.swing.*;

public class Ejercicio5 {
    static void main(String[] args) {



                int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números va a ingresar?"));
                int[] numeros = new int[n];

                for (int i = 0; i < n; i++) {
                    numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para la posición " + i + ":"));
                }

                int numeroBuscar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué número desea buscar?"));

                boolean encontrado = false;
                String posicionesEncontradas = "";


                for (int i = 0; i < n; i++) {
                    if (numeros[i] == numeroBuscar) {
                        encontrado = true;
                        posicionesEncontradas += i + " ";
                    }
                }


                }
            }



