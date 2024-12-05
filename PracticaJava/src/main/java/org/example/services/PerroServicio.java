package org.example.services;

import org.example.entities.Perro;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    long id = 0;

    public Perro agregarPerro(){
        Perro perro = new Perro();
        id++;
        System.out.println("¿Cual es el nombre del perro?");
        perro.setNombre(leer.next());
        System.out.println("¿Cual es la raza del perro");
        perro.setRaza(leer.next());
        System.out.println("¿Es hembra o macho?");
        perro.setSexo(leer.next());
        System.out.println("¿Que edad tiene (con numeros)?");
        perro.setEdad(leer.nextInt());
        System.out.println("¿Cual es el nombre del perro?");
        perro.setNombre(leer.next());
        return perro;
    }

    public Perro editarPerro(Perro perro){
        Perro perro = new Perro();
        System.out.println("Nombre anterior del bicho:" + perro.getNombre());
        System.out.println("Como se va a llamar:");
        perro.setNombre(leer.next());
        System.out.println("Raza anterior del bicho:" + perro.getRaza());
        System.out.println("Que raza es:");
        perro.setRaza(leer.next());
        System.out.println("Sexo anterior del bicho:" + perro.getSexo());
        System.out.println("¿Es macho o hembra?:");
        perro.setSexo(leer.next());
        System.out.println("Que edad tenia el bicho:" + perro.getEdad());
        System.out.println("Que edad tiene ahora:");
        perro.setRaza(leer.next());
        return perro;
    }

    public void mostramePerro(ArrayList <Perro> perrito) {
        for (Perro perro : perrito) {
            System.out.println(perro);
        }
    }

    // Ya pongo el eliminado, antes voy a ver una cosita

}
