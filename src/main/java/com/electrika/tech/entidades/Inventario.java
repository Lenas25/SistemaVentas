package com.electrika.tech.entidades;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Inventario{
    //atributos
    private String fechaInventario;
    private List<Producto> productos;


    //===================================================métodos
    public void agregarProducto(){
        int agregar= Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos deseas agregar?"));
        String fecha=JOptionPane.showInputDialog("Ingrese la fecha del dia de hoy (dd/mm/aaaa)");
        int stock;
        for (int i=0;i<agregar;i++){
            String codProducto=JOptionPane.showInputDialog("Ingrese el código del producto "+(i+1));
            for (Producto producto: productos){
                if (producto.getCodProducto().equals(codProducto)){
                    stock= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos mas quiere agregar"));
                    producto.setStock(producto.getStock()+stock);
                    System.out.println("El producto ya existe y se actualizo el stock");
                } else{
                    String nombreProducto=JOptionPane.showInputDialog("Ingrese el nombre del producto "+(i+1));
                    String descripcionProducto=JOptionPane.showInputDialog("Ingrese la descripción del producto "+(i+1));
                    stock= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto "+(i+1)));
                    float precioUnidad= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto "+(i+1)));
                    String categoriaProducto=JOptionPane.showInputDialog("Ingrese la categoría del producto "+(i+1));
                    productos.add(new Producto(codProducto,nombreProducto,descripcionProducto,stock,precioUnidad,categoriaProducto));
                    System.out.println("El producto ya se ha añadido");
                }
            }
        }
    }

    public void eliminarProducto(){
        System.out.println("Voy a eliminar un producto...");
        String codigoEliminar=JOptionPane.showInputDialog("Ingrese el código del producto");
        for(Producto inv: productos){
            if (codigoEliminar.equals(inv.getCodProducto())){
                productos.remove(inv);
            }
        }
        System.out.println("El producto ya se ha eliminado");
    }
    public void solicitarProductos(){
        System.out.println("Solicitamos productos...");
        String productoSolicitado;
        productoSolicitado= JOptionPane.showInputDialog("Ingrese el producto que desea solicitar");
        for (Producto producto: productos){
            if (productoSolicitado.equals(producto.getNombreProducto())){
                System.out.println("El producto solicitado es: "+productoSolicitado);
            }
        }
    }

    public void consultarProductos(){
        System.out.println("Te consultaré los productos: "+ this.toString());
    }

    public void actualizarStock(){
        System.out.println("Voy a actualizar el Stock...");

    }

    //================================= Método Constructor con todos sus parámetros


    public Inventario(String fechaInventario, List<Producto> productos) {
        this.fechaInventario = fechaInventario;
        this.productos = new ArrayList<>();

    }

    public Inventario() {
        this.productos= new ArrayList<>();
    }
    //=== Getters and setters ===


    public String getFechaInventario() {
        return fechaInventario;
    }

    public void setFechaInventario(String fechaInventario) {
        this.fechaInventario = fechaInventario;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        for (Producto producto: productos){
            str.append("Producto: ").append(producto.getNombreProducto()).append("\n");
        }

        return str.toString();
    }

    public abstract void eliminarProducto(String nombreProducto);

    public abstract void agregarProducto(String nombreProducto, int cantidadProducto);
}
