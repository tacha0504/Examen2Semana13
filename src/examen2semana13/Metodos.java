/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2semana13;

import javax.swing.JOptionPane;

/**
 *
 * @author TChaves
 */
public class Metodos {

    /*Se crea la matriz de 3 por 3 para las habitaciones*/
    private Habitaciones habitaciones[][] = new Habitaciones[3][3];

    /*primer metodo para llenar habitaciones con info precargada*/
    public void llenarHabitaciones() {

        habitaciones[0][0] = new Habitaciones("Ocupada", 501, "Doble", 150000);

        habitaciones[0][1] = new Habitaciones("Libre", 502, "Simple", 28000);

        habitaciones[0][2] = new Habitaciones("Sucia", 503, "Simple", 45000);

        habitaciones[1][0] = new Habitaciones("Libre", 504, "Simple", 15000);

        habitaciones[1][1] = new Habitaciones("Ocupada", 505, "Doble", 100000);

        habitaciones[1][2] = new Habitaciones("Sucia", 506, "Doble", 110000);

        habitaciones[2][0] = new Habitaciones("Libre", 507, "Simple", 30000);

        habitaciones[2][1] = new Habitaciones("Libre", 508, "Doble", 120000);

        habitaciones[2][2] = new Habitaciones("Libre", 509, "Simple", 30000);

    }

    public void agregarHabitaciones() {

        for (int x = 0; x < habitaciones.length; x++) {

            for (int y = 0; y < habitaciones.length; y++) {

                Habitaciones habi = new Habitaciones("", 0, "", 0);

                habi.setEstado(JOptionPane.showInputDialog(null, "Digite Estado:"));

                habi.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad existente:")));

                habi.setTipo(JOptionPane.showInputDialog(null, "Digite el precio del producto:"));

                habi.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio del producto:")));

                habitaciones[x][y] = habi;

            }

        }

    }

    public void visualizacionHabitaciones() {
        String s = "";

        for (int x = 0; x < 3; x++) {

            for (int y = 0; y < 3; y++) {

                s = s + (x + 1) + " \n " + habitaciones[x][y].getNumero() + " " + habitaciones[x][y].getTipo()
                        + " " + habitaciones[x][y].getPrecio() + " " + habitaciones[x][y].getEstado() + "\n\n";

            }
            JOptionPane.showMessageDialog(null, "El arreglo contiene:\n" + (x + 1) + "pisos\n" + s);
        }
    }

    public void modificarHabitaciones() {
        int x;
        int nuevoNumero;
        String nuevoTipo;
        int nuevoPrecio;
        String nuevoEstado;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de habitacion que desea editar"));
        for (int y = 0; y < habitaciones.length; y++) {
            if ((x - 1) == y) {
                nuevoNumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo numero de habitacion"));
                nuevoTipo = (JOptionPane.showInputDialog(null, "Ingrese el nuevo tipo de habitacion"));
                nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio de la habitacion"));
                nuevoEstado = (JOptionPane.showInputDialog(null, "Ingrese el nuevo estado de la habitacion"));
                habitaciones[x][y] = new Habitaciones(nuevoEstado, nuevoNumero, nuevoTipo, nuevoPrecio);
                /*} else {
                JOptionPane.showMessageDialog(null, "Ingrese un número de habitacion válida ");
            }*/

                JOptionPane.showMessageDialog(null, "La habitacion ha sido modificada con exito");
            }
        }
    }

    public void resumen() {

    }

}
