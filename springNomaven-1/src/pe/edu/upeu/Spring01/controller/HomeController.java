package pe.edu.upeu.Spring01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/home")
	public String main1() {
		return "principal";
	}
	@GetMapping("/home")
	public String main2() {
		return "main";
	}
	
	@GetMapping("/proveedor")
	public String proveedor() {
		return "proveedor";
	}
	@GetMapping("/empleado")
	public String usuario() {
		return "empleado";
	}
	
	@GetMapping("/main_compras")
	public String compras() {
		return "com_main_compras";
	}
	@GetMapping("/main_registrarcompra")
	public String registrarcompras() {
		return "com_main_registrarcompra";
	}
	
	@GetMapping("/principal")
	public String principal() {
		return "principal";
	}
	
}
