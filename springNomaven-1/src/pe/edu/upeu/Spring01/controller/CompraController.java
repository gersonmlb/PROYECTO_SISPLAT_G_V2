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
	/*
	@GetMapping("/ped_lista_hoja_contrato")
	public String lista_hoja_contrato() {
		return "ped_lista_hoja_contrato";
	}
	@GetMapping("/ped_hoja_contrato")
	public String hoja_contrato() {
		return "ped_hoja_contrato";
	}
	@GetMapping("/ped_lista_orden_trabajo")
	public String lista_orden_trabajo() {
		return "ped_lista_orden_trabajo";
	}
	@GetMapping("/ped_orden_trabajo")
	public String orden_trabajo() {
		return "ped_orden_trabajo";
	}

	@GetMapping("/ped_comprobante_pedido")
	public String comprobante_pedido() {
		return "ped_comprobante_pedido";
	}

*/
}
