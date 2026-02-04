package com.cursoapi.cursoapi.model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String matricula;
    private Integer edad;

    public Estudiante(String nombre, String apellido, String matricula, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public Integer getEdad() {
        return edad;
    }

}
