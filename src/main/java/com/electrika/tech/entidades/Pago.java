package com.electrika.tech.entidades;

import java.util.Date;

public class Pago {
    private String cod_Pago;
    private Date fechaPago;
    private String tipoPago;
    private float precioPago;
    private Usuario cliente;
    private Pedido pedidos;

    public void emision(){
        System.out.println("Emitiendo pago");
    }
    public void realizarPago(){
        System.out.println("Realizando pago");
    }
    public void boleta(){
        System.out.println("Imprimiendo Boleta \n"+ this.toString());
    }

    public Pago(String cod_Pago, Date fechaPago, String tipoPago, float precioPago, Cliente cliente) {
        this.cod_Pago = cod_Pago;
        this.fechaPago = fechaPago;
        this.tipoPago = tipoPago;
        this.precioPago = precioPago;
        this.cliente = cliente;
    }
    public String getCod_Pago() {
        return cod_Pago;
    }

    public void setCod_Pago(String cod_Pago) {
        this.cod_Pago = cod_Pago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public float getPrecioPago() {
        return precioPago;
    }

    public void setPrecioPago(float precioPago) {
        this.precioPago = precioPago;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        for (ProductoElegido pedido:pedidos.getProductoElegido()) {
            str.append("-").append(pedido.toString());
        }
        return String.format("Codigo de Pago: %s\nFecha de Pago: %s\nTipo de Pago: %s\nPrecio de Pago: %s\nCliente: %s %s\nPedido: %s",
                cod_Pago, fechaPago, tipoPago, precioPago, cliente.getNombreUsuario(), cliente.getApellidoUsuario(), str);
    }
}
