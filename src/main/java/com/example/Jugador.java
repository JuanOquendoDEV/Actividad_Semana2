package com.example;

public class Jugador {

    private String nombre;

    private int edad;

    private String posicion;

    private int numeroCamisa;

    private String equipo;


    public Jugador (String nombre , int edad , String posicion , int numeroCamisa , String equipo ) {

        this.nombre = nombre;
        this.edad = edad;
        this.posicion= posicion;
        this.numeroCamisa= numeroCamisa;
        this.equipo= equipo;

        
    }

     // metodos de acceso y modificacion de los atributos de la clase Jugador


    public String getNombre() {
        return nombre;
    
    
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion () {
        return posicion;
    }

    public void setPosicion(String posiscion) {
        this.posicion = posicion;
    }

    public int getNumroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getEquipo () {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }


 public void MostrarInformacion () {
    System.out.println("--------------------------------------------");
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad; " + edad);
    System.out.println("Posicion: " + posicion);
    System.out.println("Numero de camisa: " + numeroCamisa);
    System.out.println("Equipo: " + equipo);
    System.out.println("--------------------------------------------");

 }




}
