package org.example.entities;

import org.example.services.PerroServicio;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroControlador {
    ArrayList<Perro> perros = new ArrayList<>();
    PerroServicio perroServicio = new PerroServicio();
    Scanner leer = new Scanner(System.in);



    public void agregaPerro {
        perros.add(perroServicio.agregarPerro());
    }
}
