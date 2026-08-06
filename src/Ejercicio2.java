import javax.swing.*;

public class Ejercicio2 {
    static void main(String[] args) {

                int n = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de estudiantes:"));
                double[] notas = new double[n];
                double suma = 0;


                for (int i = 0; i < n; i++) {
                    notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota del estudiante " + (i + 1) + ":"));
                    suma += notas[i];
                }

            }
        }



