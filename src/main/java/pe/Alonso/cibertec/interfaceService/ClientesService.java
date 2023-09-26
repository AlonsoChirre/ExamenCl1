package pe.Alonso.cibertec.interfaceService;

import java.util.List;

import pe.Alonso.cibertec.entity.Clientes;

public interface ClientesService {
	public List<Clientes> listar();
	public Clientes grabar(Clientes clientes);
}
