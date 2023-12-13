package com.Infraestructure.DbManagment.models;

import java.util.Date;

public class Cliente {
    private int idCliente;
    private int idPersona;
    private Date fechaIngreso;
    private String calificacion;
    private String estado;

    public Cliente(int idCliente, int idPersona, Date fechaIngreso, String calificacion, String estado) {
        this.idCliente = idCliente;
        this.idPersona = idPersona;
        this.fechaIngreso = fechaIngreso;
        this.calificacion = calificacion;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}