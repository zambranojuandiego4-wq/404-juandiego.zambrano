import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("cuantas temperaturas va ingresar"));

        int[] temperaturas = new int[n];

        String resultados = "";

        for (int i = 0; i < n; i++) {
            temperaturas[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de cada temperatura"));


            if (temperaturas[i] < 10) {
                resultados += temperaturas[i] + "°C = frio\n";

            } else if (temperaturas[i] > 10 && temperaturas[i] <= 25) {
                resultados += temperaturas[i] + "°C = templado\n";

            } else {
                resultados += temperaturas[i] + "°C = caluroso\n";
            }
}
            JOptionPane.showMessageDialog(null, "temperaturas registradas \n \n " + resultados);

    }
}
