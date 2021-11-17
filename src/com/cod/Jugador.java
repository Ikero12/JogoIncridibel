package com.cod;

import javax.swing.*;

public class Jugador {
    private String jugador1;
    private String jugador2;

    //Metodos

    public void juego() {
        int numeroAdv1 = Integer.parseInt(JOptionPane.showInputDialog(jugador1 + " Introduzca un número entre el 0 y 50: "));
        int i = 0;
        int numeroAdv2 = Integer.parseInt(JOptionPane.showInputDialog("Hora de adivinar " + jugador2 + "." + "Introduzca el número que cree que es: "));

        if (numeroAdv1 != numeroAdv2) {
            while (i != numeroAdv1 && numeroAdv1 != numeroAdv2) {


                if (numeroAdv2 > numeroAdv1) {
                    JOptionPane.showMessageDialog(null, "El número introducido es mayor que el resultado.");
                } else {
                    JOptionPane.showMessageDialog(null, "El número introducido es menor que el resultado.");
                }
                i++;
                numeroAdv2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número porfavor: "));

            }
        }
        if (numeroAdv1 == numeroAdv2)
            JOptionPane.showMessageDialog(null, "Enhorabuena!");
        else
            JOptionPane.showMessageDialog(null, "Pringao has perdido!");
    }


    public String setJugador1(String jugador1) {
        this.jugador1 = jugador1;
        return jugador1;
    }

    public String setJugador2(String jugador2) {
        this.jugador2 = jugador2;
        return jugador2;
    }


}
