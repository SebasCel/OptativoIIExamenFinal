package com.Infraestructure.DbManagment.Models;

public class Ciudad {
    private int idCiudad;
    private String ciudad;
    private String departamento;
    private String postalCode;

    public Ciudad(int idCiudad, String ciudad, String departamento, String postalCode) {
        this.idCiudad = idCiudad;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.postalCode = postalCode;
    }

    public int getIdCiudad() {
        return idCiudad;
    }
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }    
}