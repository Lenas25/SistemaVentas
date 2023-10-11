
package com.electrika.tech.dao.impl;

import com.electrika.tech.dao.DaoCategoria;
import com.electrika.tech.entidades.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DaoCategoriaImpl implements DaoCategoria {

    @Override
    public List<Categoria> categoriaSel() {
        List<Categoria> lista = new ArrayList<>();
        lista.add(new Categoria(1,"Laptops",""));
        lista.add(new Categoria(2,"Teclados",""));
        lista.add(new Categoria(3,"Tarjetas gráficas",""));
        return lista;
    }

    @Override
    public Categoria categoriaGet(Integer id) {
        return null;
    }

    @Override
    public String categoriaIns(Categoria categoria) {
        categoriaSel().add(categoria);
        return categoria.toString();
    }

    @Override
    public String categoriaUpd(Categoria categoria, String nombre, String descripcion) {
        categoria.setNombre(nombre);
        categoria.setDescripcion(descripcion);
        return "Ya se edito";
    }

    @Override
    public String categoriaDel(Integer id) {
        for (Categoria categoriaSel : categoriaSel()) {
            if (categoriaSel.getId().equals(id)) {
                categoriaSel().remove(id);  
                return "La categoria eliminada es "+categoriaSel.getNombre();
            }
        }
        return "No se elimino ninguna categoria";
    }
}