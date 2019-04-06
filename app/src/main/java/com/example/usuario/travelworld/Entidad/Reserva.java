package com.example.usuario.travelworld.Entidad;

public class Reserva {

    private int Numero;
    private String Estado;

    public Reserva(int Numero, String Estado) {
        this.Numero=Numero;
        this.Estado=Estado;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
