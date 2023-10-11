
package com.electrika.tech.dao.impl;

import com.electrika.tech.dao.DaoUsuario;
import com.electrika.tech.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DaoUsuarioImpl implements DaoUsuario{

    @Override
    public String registrarUsuario(Usuario usuario) {
        for (Usuario listarUsuario : listarUsuario()) {
            if (listarUsuario.getCodUsuario().equals(usuario.getCodUsuario())) {
                return "El usuario ya existe";
            }else{
                listarUsuario().add(usuario);
                return "Ya se registro un nuevo usuario";
            }
        }
        return "No se registro el usuario";
    }
    
    @Override
    public String iniciarSesion(Usuario usuario){
        for(Usuario listarUsuario : listarUsuario()){
            if (listarUsuario.getCodUsuario().equals(usuario.getCodUsuario())) {
                return "Inicio sesion Completado";
            }else{
                listarUsuario().add(usuario);
                return "No existe el usuario ingresado";
            }
        }
        return "No se ingreso sesion";
    }
    
    @Override 
    public List<Usuario> listarUsuario(){
        List<Usuario> listaUsers = new ArrayList<>();
        return listaUsers;
    }
    
    @Override 
    public String eliminarUsuario(String codigoUser){
        for (Usuario listarUsuario : listarUsuario()) {
            if (listarUsuario.getCodUsuario().equals(codigoUser)) {
                listarUsuario().remove(codigoUser);  
                return "El usuario eliminado tiene como codigo "+codigoUser;
            }
        }
        return "No se elimino ningun usuario";
    }
    
}
