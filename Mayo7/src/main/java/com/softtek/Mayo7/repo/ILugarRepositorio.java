package com.softtek.Mayo7.repo;

import com.softtek.Mayo7.modelo.Lugar;
import com.softtek.Mayo7.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugarRepositorio extends JpaRepository<Lugar,Integer> {
}
