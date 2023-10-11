package com.electrika.tech.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
    private String dni;
    private String direccion;
    private String correo;
    private List<Pedido> pedido;

    public Cliente(String dni, String direccion, String correo, List<Pedido> pedido, String codUsuario, String apellidoUsuario, String nombreUsuario, String usuario, String password, String telefonoUsuario) {
        super(codUsuario, apellidoUsuario, nombreUsuario, usuario, password, telefonoUsuario);
        this.dni = dni;
        this.direccion = direccion;
        this.correo = correo;
        this.pedido = pedido;
    }

    public Cliente() {
    }
    
    //getter and setter

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        StringBuilder str= new StringBuilder();
        str.append("Los pedidos realizados por el cliente fueron: \n");
        for (Pedido pedido: pedido) {
            str.append("- ").append(pedido.toString());
        }
        return str.toString();
    }

}
