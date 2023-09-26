package pe.Alonso.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.Alonso.cibertec.entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer>{

}
