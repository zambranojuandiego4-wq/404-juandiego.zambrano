import javax.swing.*;

public class Ejercicio3 {
    static void main(String[] args) {

                int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números ingresará?:"));
                int[] numeros = new int[n];

                // 1. Llenar el array con los números ingresados
                for (int i = 0; i < n; i++) {
                    numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número " + (i + 1) + ":"));
                }

                int mayor = numeros[0];
                int menor = numeros[0];

                for (int i = 1; i < n; i++) {
                    if (numeros[i] > mayor) {
                        mayor = numeros[i];
                    }
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                    }
                }

                JOptionPane.showMessageDialog(null, "Valor mayor: " + mayor + "\nValor menor: " + menor);
            }
        }




