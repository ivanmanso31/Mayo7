package com.softtek.Mayo7.servicio;

import com.softtek.Mayo7.modelo.Lugar;
import com.softtek.Mayo7.modelo.Producto;
import com.softtek.Mayo7.repo.ILugarRepositorio;
import com.softtek.Mayo7.repo.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarServicioImpl implements ILugarServicio{

    @Autowired
    private ILugarRepositorio lugarRepositorio;


    @Override
    public Lugar insertar(Lugar l) {
        return lugarRepositorio.save(l);
    }

    @Override
    public Lugar modificar(Lugar l) {
        return lugarRepositorio.save(l);
    }

    @Override
    public void eliminar(int id) {
        lugarRepositorio.deleteById(id);
    }

    @Override
    public List<Lugar> obtenerTodos() {
        return lugarRepositorio.findAll();
    }

    @Override
    public Lugar obtenerUno(int id) {
        return lugarRepositorio.findById(id).orElse(new Lugar());
    }
}
