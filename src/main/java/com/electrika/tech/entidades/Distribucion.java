package com.electrika.tech.entidades;

import javax.swing.*;
import java.util.Date;

public class Distribucion {
    private Integer codDistribucion;
    private Date fechaDistribucion;
    private String metodoDistribucion;
    private Cliente cliente;

    public Distribucion(Integer codDistribucion, Date fechaDistribucion, Cliente cliente) {
        this.codDistribucion = codDistribucion;
        this.fechaDistribucion = fechaDistribucion;
        this.metodoDistribucion = "Presencial";
        this.cliente = cliente;
    }

    public void tipoEntrega() {
        metodoDistribucion= JOptionPane.showInputDialog("Ingrese el tipo de entrega (Delivery/Presencial)");
        if (metodoDistribucion.equals("Delivery")){
            System.out.println("El costo de envio a" +cliente.getDireccion()+ " es de 5 soles");
        }
    }

    public Integer getCodDistribucion() {
        return codDistribucion;
    }

    public void setCodDistribucion(Integer codDistribucion) {
        this.codDistribucion = codDistribucion;
    }

    public Date getFechaDistribucion() {
        return fechaDistribucion;
    }

    public void setFechaDistribucion(Date fechaDistribucion) {
        this.fechaDistribucion = fechaDistribucion;
    }

    public String getMetodoDistribucion() {
        return metodoDistribucion;
    }

    public void setMetodoDistribucion(String metodoDistribucion) {
        this.metodoDistribucion = metodoDistribucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        str.append("Codigo de Distribucion: "+codDistribucion+"\n")
            .append("Fecha de Distribucion: "+fechaDistribucion+"\n")
            .append("Metodo de Distribucion: "+metodoDistribucion+"\n");
        return str.toString();
    }
}
