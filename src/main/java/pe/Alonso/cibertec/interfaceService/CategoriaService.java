package pe.Alonso.cibertec.interfaceService;

import java.util.List;
import java.util.Optional;

import pe.Alonso.cibertec.entity.Categorias;

public interface CategoriaService {
	public List<Categorias> listar();
	public Optional<Categorias> buscar(int id);
	public Categorias agregar(Categorias categoria);
}
