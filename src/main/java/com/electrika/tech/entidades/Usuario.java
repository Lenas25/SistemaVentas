package com.electrika.tech.entidades;

public class Usuario {
    private String codUsuario;
    private String apellidoUsuario;
    private String nombreUsuario;
    private String usuario;
    private String password;
    private String telefonoUsuario;

    public Usuario(String codUsuario, String apellidoUsuario, String nombreUsuario, String usuario, String password, String telefonoUsuario) {
        this.codUsuario = codUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.password = password;
        this.telefonoUsuario = telefonoUsuario;
    }

    public Usuario() {
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

}
