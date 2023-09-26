package pe.Alonso.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.Alonso.cibertec.entity.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer>{

}
