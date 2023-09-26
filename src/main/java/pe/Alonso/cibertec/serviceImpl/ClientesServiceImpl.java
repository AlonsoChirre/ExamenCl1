package pe.Alonso.cibertec.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.Alonso.cibertec.entity.Clientes;
import pe.Alonso.cibertec.interfaceService.ClientesService;
import pe.Alonso.cibertec.repository.ClientesRepository;

@Service
public class ClientesServiceImpl implements ClientesService{

	@Autowired
	private ClientesRepository clienteRepository;

	@Override
	public List<Clientes> listar() {
		
		return clienteRepository.findAll();
	}

	@Override
	public Clientes grabar(Clientes clientes) {
		
		return clienteRepository.save(clientes);
	}
}
