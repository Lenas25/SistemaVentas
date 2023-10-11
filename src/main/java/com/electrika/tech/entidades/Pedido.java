package com.electrika.tech.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer id_pedido;
    private String estPedido;
    private Date fechaPedido;
    private String descripcionPedido;
    private List<ProductoElegido> productoElegido;

    public Pedido(Integer id_pedido, String estPedido, Date fechaPedido, String descripcionPedido, List<Producto> producto) {
        this.id_pedido = id_pedido;
        this.estPedido = estPedido;
        this.fechaPedido = fechaPedido;
        this.descripcionPedido = descripcionPedido;
        this.productoElegido = new ArrayList<>();
    }

    public void registroPedido(){
        System.out.println("Su pedido esta registrado");
    }
    public void envioCorreo(){
        System.out.println("Revise su correo");
    }
    public void verificarPed(){
        System.out.println("Pedido verificado");
    }

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getEstPedido() {
        return estPedido;
    }

    public void setEstPedido(String estPedido) {
        this.estPedido = estPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getDescripcionPedido() {
        return descripcionPedido;
    }

    public void setDescripcionPedido(String descripcionPedido) {
        this.descripcionPedido = descripcionPedido;
    }

    public List<ProductoElegido> getProductoElegido() {
        return productoElegido;
    }

    public void setProductoElegido(List<ProductoElegido> productoElegido) {
        this.productoElegido = productoElegido;
    }
}
