package com.example;

public class Main {
    public static void main(String[] args) {
    
  Jugador jugador1 = new Jugador ("Juan" , 25 , "Delantero" , 7 , "Nacional");
    
  Jugador jugador2 = new Jugador("James" , 23, "Mediocampista", 10, "Real Madrid");
   

    jugador2.MostrarInformacion();
    jugador1.MostrarInformacion();


    jugador2.setEdad(24);

    jugador2.MostrarInformacion();


    }
}