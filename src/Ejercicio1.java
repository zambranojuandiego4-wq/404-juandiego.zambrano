import javax.swing.*;

public class Ejercicio1 {
    static void main(String[] args) {


                String entradaN = JOptionPane.showInputDialog("Cantidad de números:");
                int n = Integer.parseInt(entradaN);

                int[] numeros = new int[n];


                for (int i = 0; i < n; i++) {
                    String entradaNum = JOptionPane.showInputDialog("Introduce el número " + (i + 1) + ":");
                    numeros[i] = Integer.parseInt(entradaNum);
                }

                int pares = 0;
                int impares = 0;

                for (int i = 0; i < n; i++) {
                    if (numeros[i] % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                }

                String mensaje = "Pares: " + pares + "\nImpares: " + impares;
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }



