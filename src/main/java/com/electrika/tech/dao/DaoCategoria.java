
package com.electrika.tech.dao;

import com.electrika.tech.entidades.Categoria;
import java.util.List;


public interface DaoCategoria {
    List<Categoria> categoriaSel();
    Categoria categoriaGet(Integer id);
    String categoriaIns(Categoria categoria);
    String categoriaUpd(Categoria categoria, String nombre, String descripcion);
    String categoriaDel(Integer id);
}
