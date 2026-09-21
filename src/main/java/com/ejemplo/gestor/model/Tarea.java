package com.ejemplo.gestor.model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Tarea {

    private int id;
    private String titulo;
    private String prioridad;
    private boolean completada;

    public Tarea() {
    }

    @PostMapping
    public Tarea crear(@RequestBody Tarea tarea) {
    return tarea;
    }

    public Tarea(int id, String titulo, String prioridad, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}