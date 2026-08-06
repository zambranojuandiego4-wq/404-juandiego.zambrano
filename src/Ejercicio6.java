import javax.swing.*;

public class Ejercicio6 {
    static void main(String[] args) {

                int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos votos se van a registrar?"));


                char[] votos = new char[n];


                for (int i = 0; i < n; i++) {
                    String input = JOptionPane.showInputDialog("Ingrese el voto " + (i + 1) + " (A, B o C):").toUpperCase();

                    votos[i] = input.charAt(0);
                }

                int votosA = 0;
                int votosB = 0;
                int votosC = 0;


                for (int i = 0; i < n; i++) {
                    // CORRECCIÓN: En los "case" usamos comillas simples '' porque son valores char
                    switch (votos[i]) {
                        case 'A':
                            votosA++;
                            break;
                        case 'B':
                            votosB++;
                            break;
                        case 'C':
                            votosC++;
                            break;
                        default:
                            break;
                    }
                }


                String ganador = "";
                int maxVotos = Math.max(votosA, Math.max(votosB, votosC));

                if (votosA == maxVotos && votosB == maxVotos && votosC == maxVotos) {
                    ganador = "Triple empate entre A, B y C";
                } else if (votosA == maxVotos && votosB == maxVotos) {
                    ganador = "Empate entre Candidato A y Candidato B";
                } else if (votosA == maxVotos && votosC == maxVotos) {
                    ganador = "Empate entre Candidato A y Candidato C";
                } else if (votosB == maxVotos && votosC == maxVotos) {
                    ganador = "Empate entre Candidato B y Candidato C";
                } else if (votosA == maxVotos) {
                    ganador = "Ganador: Candidato A";
                } else if (votosB == maxVotos) {
                    ganador = "Ganador: Candidato B";
                } else {
                    ganador = "Ganador: Candidato C";
                }

                // 5. Mostrar los resultados finales
                String reporte = "--- Resultados del Conteo ---\n" +
                        "Candidato A: " + votosA + " votos\n" +
                        "Candidato B: " + votosB + " votos\n" +
                        "Candidato C: " + votosC + " votos\n\n" +
                        ganador;

                JOptionPane.showMessageDialog(null, reporte);
            }
        }



