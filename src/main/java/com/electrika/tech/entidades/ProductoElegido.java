package com.electrika.tech.entidades;

import java.util.List;

public class ProductoElegido extends Inventario{
    private  String codProductoElegido;
    private  Integer cantidadProducto;

    public ProductoElegido(String codProductoElegido, Integer cantidadProducto) {
        this.codProductoElegido = codProductoElegido;
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public void eliminarProducto(String nombreProducto){
        for (Producto producto: getProductos()){
            if (nombreProducto.equals(producto.getNombreProducto())){
                getProductos().remove(producto);
            }
        }
    }
    @Override
    public void agregarProducto(String nombreProducto, int cantidadProducto){
        for (Producto producto: getProductos()){
            if (nombreProducto.equals(producto.getNombreProducto())){
                producto.setStock(producto.getStock()+cantidadProducto);
            }
        }
    }

    public float precioProductoElegido(String codigoProducto){
        float precioUnidad = 0;
        for(Producto producto: getProductos()){
            if (codigoProducto.equals(producto.getCodProducto())){
                precioUnidad = producto.getPrecioUnidad();
            }
        }
        return precioUnidad * cantidadProducto;
    }
    // getter and setter


    public String getCod_ProductoElegido() {
        return codProductoElegido;
    }

    public void setCod_ProductoElegido(String cod_ProductoElegido) {
        this.codProductoElegido = cod_ProductoElegido;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}

