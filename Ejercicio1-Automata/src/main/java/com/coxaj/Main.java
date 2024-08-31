package com.coxaj;

public class Main {
    public static void main(String[] args) {
        Automata aut = new Automata();
        String cadena = "ccccabd";
        aut.car = cadena.toCharArray();
        aut.inicio();
        if(aut.aceptado){
            System.out.println("Cadena Aceptada");
        }else{
            System.out.println("Cadena No Aceptada");
        }
    }
}