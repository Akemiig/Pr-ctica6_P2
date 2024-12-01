package com.mycompany.automatas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingresa una cadena:");
        String a=lector.nextLine();
        Gramatica analizar = new Gramatica(a);
        System.out.println(analizar.esValido());
    }
}
