package com.electrika.tech.entidades;

import javax.swing.*;

public class Login {
    private Usuario usuario;

    private int ingresos;

    public Login(Usuario usuario, int ingresos) {
        this.usuario = usuario;
        this.ingresos = ingresos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public void validarIngreso(Usuario usuario){
        String user= JOptionPane.showInputDialog("Ingrese su usuario");
        String pass= JOptionPane.showInputDialog("Ingrese su contraseña");
        if (user.equals(usuario.getUsuario())){
            if (pass.equals(usuario.getPassword())){
                JOptionPane.showMessageDialog(null,"Bienvenido "+user);
                ingresos++;
            }else{
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Usuario incorrecto");
        }
    }


}
