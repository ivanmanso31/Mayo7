package com.softtek.Mayo7.servicio;

import com.softtek.Mayo7.modelo.Lugar;

import java.util.List;

public interface ILugarServicio {
    Lugar insertar(Lugar l);
    Lugar modificar(Lugar l);
    void eliminar(int id);
    List<Lugar> obtenerTodos();
    Lugar obtenerUno(int id);
}
