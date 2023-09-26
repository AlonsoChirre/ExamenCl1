package pe.Alonso.cibertec.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.Alonso.cibertec.entity.Categorias;
import pe.Alonso.cibertec.interfaceService.CategoriaService;
import pe.Alonso.cibertec.repository.CategoriasRepository;

@Service
public class CategoriasServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriasRepository categoriaRepository;

	@Override
	public List<Categorias> listar() {
		
		return categoriaRepository.findAll();
	}

	@Override
	public Optional<Categorias> buscar(int id) {
		
		return categoriaRepository.findById(id);
	}

	@Override
	public Categorias agregar(Categorias categoria) {
		
		return categoriaRepository.save(categoria);
	}
}
