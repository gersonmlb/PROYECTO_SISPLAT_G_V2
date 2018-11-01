package pe.edu.upeu.Spring01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VentaController {
	@GetMapping("/clientenatural")
	public String clientenatural() {
		return "ven_cliente_natural";
	}
	@GetMapping("/clientejuridico")
	public String clientejuridico() {
		return "ven_cliente_juridico";
	}
	@GetMapping("/venta")
	public String venta() {
		return "venta";
	}
}
