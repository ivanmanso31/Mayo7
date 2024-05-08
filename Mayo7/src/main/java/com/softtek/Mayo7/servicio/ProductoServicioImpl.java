package com.softtek.Mayo7.servicio;

import com.softtek.Mayo7.modelo.Producto;
import com.softtek.Mayo7.repo.IGenericoRepositorio;
import com.softtek.Mayo7.repo.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl extends CRUDImpl<Producto,Integer> implements IProductoServicio{

    @Autowired
    private IProductoRepositorio repo;

    @Override
    protected IGenericoRepositorio<Producto, Integer> getRepo() {
        return repo;
    }
}
