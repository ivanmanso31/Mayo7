package com.softtek.Mayo7.controlador;

import com.softtek.Mayo7.modelo.Lugar;
import com.softtek.Mayo7.modelo.Producto;
import com.softtek.Mayo7.servicio.ILugarServicio;
import com.softtek.Mayo7.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/lugares")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladorLugar {

    @Autowired
    private ILugarServicio servicio;

    @GetMapping
    public List<Lugar> obternerTodos(){
        return servicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Lugar obternerUno(@PathVariable int id){
        return servicio.obtenerUno(id);
    }

    @PostMapping
    public Lugar insertar(@RequestBody Lugar l){
        return servicio.insertar(l);
    }

    @PutMapping
    public Lugar modificar(@RequestBody Lugar l){
        return servicio.modificar(l);
    }
    @DeleteMapping("/{id}")
    public void borrar(@PathVariable int id){
        servicio.eliminar(id);
    }
}
