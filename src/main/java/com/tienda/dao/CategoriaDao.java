package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoriaDao extends JpaRepository<Categoria, Long>{

         List<Categoria> findByDescripcionContaining(String descripcion);
}
