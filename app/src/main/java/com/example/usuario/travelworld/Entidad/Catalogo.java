package com.example.usuario.travelworld.Entidad;


public class Catalogo {

    private int Codigo;
    private String Destino;
    private String Procedencia;
    private String Temporada;
    private int Precio;

    public Catalogo(int Codigo, String Destino, String Procedencia, String Temporada, int Precio) {
        this.Codigo=Codigo;
        this.Destino=Destino;
        this.Procedencia=Procedencia;
        this.Temporada=Temporada;
        this.Precio=Precio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(String procedencia) {
        Procedencia = procedencia;
    }

    public String getTemporada() {
        return Temporada;
    }

    public void setTemporada(String temporada) {
        this.Temporada = temporada;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }
}
