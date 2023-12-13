package com.Infraestructure.DbManagment.Models;

import java.util.Date;

public class Movimiento {
    private int idMovimiento;
    private int idCuenta;
    private Date fechaMovimiento;
    private String tipoMovimiento;
    private int saldoAnterior;
    private int saldoActual;
    private int montoMovimiento;
    private int cuentaOrigen;
    private int cuentaDestino;
    private int canal;

    public Movimiento(int idMovimiento, int idCuenta, Date fechaMovimiento, String tipoMovimiento,
                      int saldoAnterior, int saldoActual, int montoMovimiento, int cuentaOrigen,
                      int cuentaDestino, int canal) {
        this.idMovimiento = idMovimiento;
        this.idCuenta = idCuenta;
        this.fechaMovimiento = fechaMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.saldoAnterior = saldoAnterior;
        this.saldoActual = saldoActual;
        this.montoMovimiento = montoMovimiento;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.canal = canal;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }
    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }
    public int getIdCuenta() {
        return idCuenta;
    }
    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }
    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }
    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }
    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    public int getSaldoAnterior() {
        return saldoAnterior;
    }
    public void setSaldoAnterior(int saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }
    public int getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    public int getMontoMovimiento() {
        return montoMovimiento;
    }
    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }
    public int getCuentaOrigen() {
        return cuentaOrigen;
    }
    public void setCuentaOrigen(int cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }
    public int getCuentaDestino() {
        return cuentaDestino;
    }
    public void setCuentaDestino(int cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }    
}