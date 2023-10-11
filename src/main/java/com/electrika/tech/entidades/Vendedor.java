package com.electrika.tech.entidades;

public class Vendedor extends Usuario{
    private String puestoArea;
    private String fechaIngreso;
    private String fechaSalida;

    public Vendedor(String codUsuario, String apellidoUsuario, String nombreUsuario, String usuario, String password, String telefonoUsuario, String puestoArea, String fechaIngreso, String fechaSalida) {
        super(codUsuario, apellidoUsuario, nombreUsuario, usuario, password, telefonoUsuario);
        this.puestoArea = puestoArea;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    // getter and setter
    public String getPuestoArea() {
        return puestoArea;
    }

    public void setPuestoArea(String puestoArea) {
        this.puestoArea = puestoArea;
    }

    // metodos
    public void registrarIngresoSalida(){
        System.out.println(this.toString());

    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de ingreso: ").append(fechaIngreso).append("\n");
        sb.append("Fecha de salida: ").append(fechaSalida).append("\n");
        sb.append("Vendedor: ").append(getNombreUsuario()).append(" ").append(getApellidoUsuario()).append("\n" );
        return sb.toString();
    }

}

