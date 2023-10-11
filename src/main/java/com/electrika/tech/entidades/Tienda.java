package com.electrika.tech.entidades;


public class Tienda {
    private String nombreTienda;
    private String direccionTienda;
    private String telefonoTenda;
    private String ruc;

    private Login login;

    public Tienda() {
    }

    public Tienda(String nombreTienda, String direccionTienda, String telefonoTenda, String ruc) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.telefonoTenda = telefonoTenda;
        this.ruc = ruc;
    }
    public void estadoTienda(Login login){
        if (login.getIngresos()==0) {
            System.out.println("La tienda esta cerrada");
        }else{
            System.out.println("La tienda esta abierta");
        }
    }
}
