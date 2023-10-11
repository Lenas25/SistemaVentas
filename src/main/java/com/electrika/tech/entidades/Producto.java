package com.electrika.tech.entidades;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Producto{
    //atributos
    private String codProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private int stock;
    private Float precioUnidad;
    private String categoriaProducto;

    //método constructor con todos sus parámetros


    public Producto(String codProducto, String nombreProducto, String descripcionProducto, int stock, Float precioUnidad, String categoriaProducto) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.stock = stock;
        this.precioUnidad = precioUnidad;
        this.categoriaProducto = categoriaProducto;
    }

    //getters and setters
    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Float getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

}

