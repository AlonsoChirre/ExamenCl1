package pe.Alonso.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import pe.Alonso.cibertec.entity.Clientes;
import pe.Alonso.cibertec.interfaceService.CategoriaService;
import pe.Alonso.cibertec.interfaceService.ClientesService;

@Controller
@RequestMapping("/cliente")
public class ClientesController {
	
	@Autowired
	private ClientesService clienteService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/lista")
	public String listadosClientes(Model model) {
		List<Clientes> lista = clienteService.listar();
		model.addAttribute("listado", lista);
		
		return "listadosClientes";
	}
	
	@GetMapping("/agregar")
	public String agregar(Model model) {
		model.addAttribute("idcliente", new Clientes());
		
		return "agregarForms";
	}
	
	@PostMapping("/Grabar")
	public String Grabar(@Validated Clientes clientes) {
		clienteService.grabar(clientes);
		
		return "redirect:/lista";
	}
}
