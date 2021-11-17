package com.cod;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Jugador juego = new Jugador();

        juego.setJugador1(JOptionPane.showInputDialog("Introduce el nombre del primero jugador aquí: "));
        juego.setJugador2(JOptionPane.showInputDialog("Introduce el nombre del segundo jugador aquí: "));

        juego.juego();
    }
}
