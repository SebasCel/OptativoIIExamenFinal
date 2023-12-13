package com.Infraestructure.DbManagment.Models;

import java.util.Date;

public class Cuenta {
    private int idCuenta;
    private int idCliente;
    private String nroCuenta;
    private Date fechaAlta;
    private String tipoCuenta;
    private String estado;
    private int saldo;
    private String nroContrato;
    private int costoMantenimiento;
    private int promedioAcreditacion;
    private String moneda;

    public Cuenta(int idCuenta, int idCliente, String nroCuenta, Date fechaAlta, String tipoCuenta,
                  String estado, int saldo, String nroContrato, int costoMantenimiento,
                  int promedioAcreditacion, String moneda) {
        this.idCuenta = idCuenta;
        this.idCliente = idCliente;
        this.nroCuenta = nroCuenta;
        this.fechaAlta = fechaAlta;
        this.tipoCuenta = tipoCuenta;
        this.estado = estado;
        this.saldo = saldo;
        this.nroContrato = nroContrato;
        this.costoMantenimiento = costoMantenimiento;
        this.promedioAcreditacion = promedioAcreditacion;
        this.moneda = moneda;
    }

    public int getIdCuenta() {
        return idCuenta;
    }
    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getNroCuenta() {
        return nroCuenta;
    }
    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    public Date getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public String getNroContrato() {
        return nroContrato;
    }
    public void setNroContrato(String nroContrato) {
        this.nroContrato = nroContrato;
    }
    public int getCostoMantenimiento() {
        return costoMantenimiento;
    }
    public void setCostoMantenimiento(int costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }
    public int getPromedioAcreditacion() {
        return promedioAcreditacion;
    }
    public void setPromedioAcreditacion(int promedioAcreditacion) {
        this.promedioAcreditacion = promedioAcreditacion;
    }
    public String getMoneda() {
        return moneda;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    } 
}
