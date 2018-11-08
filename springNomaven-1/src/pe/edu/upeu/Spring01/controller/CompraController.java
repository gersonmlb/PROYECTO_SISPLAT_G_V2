package pe.edu.upeu.Spring01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompraController {
	
	
	@GetMapping("/Crear-Orden-Compra")
	public String crearordencompra() {
		return "com_main_listascompras";
	}

	@GetMapping("/Registrar-Orden-de-Compra")
	public String registrarordencompra() {
		return "com_main_registrarcompra";
	}
	@GetMapping("/Aceptar-Orden-de-Compra")
	public String registrarordencompra2() {
		
		return "com_main_listascompras2";
	}
}
