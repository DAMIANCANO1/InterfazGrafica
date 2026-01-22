/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author damia
 */
public class CuentaRegresiva {

    public static void main(String args[]) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un dato\n para cuenta regresiva", "ingreso de datos", JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, "inicia cuenta regresiva", "CUENTA REGRESIVA", JOptionPane.INFORMATION_MESSAGE);

        while (valor >= 0) {
            if (valor == 0) {
                JOptionPane.showMessageDialog(null, "KABOOM", "CUENTA REGRESIVA", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, valor);
            }
            valor--;

        }

    }

}
