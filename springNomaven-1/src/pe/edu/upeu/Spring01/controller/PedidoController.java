package pe.edu.upeu.Spring01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import pe.edu.upeu.Spring01.pojo.Usuario;

@Controller
public class PedidoController {
	@GetMapping("/ped_main_pedido")
	public String mainpedido() {
		return "ped_principal_pedido";
	}
	
	@GetMapping("/ped_lista_nuevo_pedido")
	public String listanuevo_pedido() {
		return "ped_lista_nuevo_pedido";
	}
	@GetMapping("/ped_nuevo_pedido")
	public String pedido_nuevo() {
		return "ped_nuevo_pedido";
	}
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
	
	/*
	private Gson g = new Gson();
	@RequestMapping(value = "/hc")
	public void listarusuarios(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			
			
			break;
		
		}
*/
	}
	
