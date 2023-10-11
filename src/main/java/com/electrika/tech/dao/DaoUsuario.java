
package com.electrika.tech.dao;

import com.electrika.tech.entidades.Usuario;
import java.util.List;

public interface DaoUsuario {
    String registrarUsuario(Usuario usuario);
    String eliminarUsuario(String codigoUser);
    String iniciarSesion(Usuario usuario);
    List<Usuario> listarUsuario();
}
