package com.example.jandr.prueba.Entidades;

import java.io.Serializable;

public class Recomendacion implements Serializable {

    private String titulo;
    private String descripcion;
    private int imagen;
    String videoUrl;

    public Recomendacion() {
    }

    public Recomendacion(String titulo, String descripcion, int imagen, String videoUrl) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.videoUrl = videoUrl;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
