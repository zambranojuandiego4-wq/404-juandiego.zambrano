import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("cuantas temperaturas va ingresar"));

        int[] temperaturas = new int[n];

        String resultados = "";

        for (int i = 0; i < n; i++) {
            temperaturas[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de cada temperatura"));


        }
    }
}
