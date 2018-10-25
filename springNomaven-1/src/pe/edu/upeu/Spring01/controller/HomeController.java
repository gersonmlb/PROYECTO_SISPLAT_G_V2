package pe.edu.upeu.Spring01.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.UsuarioService;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "principal";
	}
	@PostMapping("/home")
	public String main1() {
		return "principal";
	}
	@GetMapping("/home")
	public String main2() {
		return "main";
	}
	@GetMapping("/clientenatural")
	public String clientenatural() {
		return "ven_cliente_natural";
	}
	@GetMapping("/clientejuridico")
	public String clientejuridico() {
		return "ven_cliente_juridico";
	}
	@GetMapping("/proveedor")
	public String proveedor() {
		return "proveedor";
	}
	@GetMapping("/empleado")
	public String usuario() {
		return "empleado";
	}
	@GetMapping("/venta")
	public String venta() {
		return "venta";
	}
	@GetMapping("/ped_main_pedido")
	public String nuevopedido() {
		return "ped_main_pedido";
	}
	@GetMapping("/ped_comprobante_pedido")
	public String comprobante_pedido() {
		return "ped_comprobante_pedido";
	}
	@GetMapping("/ped_hoja_contrato")
	public String hoja_contrato() {
		return "ped_hoja_contrato";
	}
	@GetMapping("/ped_orden_trabajo")
	public String orden_trabajo() {
		return "ped_orden_trabajo";
	}
	@GetMapping("/ped_nuevo_pedido")
	public String nuevo_pedido() {
		return "ped_nuevo_pedido";
	}
	
	@GetMapping("/main_compras")
	public String compras() {
		return "com_main_compras";
	}
	
	@GetMapping("/principal")
	public String principal() {
		return "principal";
	}
	
	
	
	
	
	private Gson g = new Gson();

	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(value = "/hc")
	public void listarusuarios(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(g.toJson(usuarioService.readAll()));
			break;
		case 2:
			Usuario us = new Usuario(request.getParameter("nomuser"), request.getParameter("clave"));
			usuarioService.create(us);
			break;
		case 3:
			out.println(g.toJson(usuarioService.read(Integer.parseInt(request.getParameter("id1")))));
			break;
		case 4:
			Usuario use = new Usuario(Integer.parseInt(request.getParameter("id")), request.getParameter("nomuser"),
					request.getParameter("clave"), request.getParameter("estado"));
			usuarioService.update(use);
			break;
		case 5:
			usuarioService.delete(Integer.parseInt(request.getParameter("id")));
			break;
		}

	}
	/*
	 * 
	 * @RequestMapping(value = "/user") public ModelAndView listar() { ModelAndView
	 * ma = new ModelAndView(); ma.setViewName("user"); // List<Usuario> list =
	 * usuarioService.readAll(); ma.addObject("lista", usuarioService.readAll());
	 * return ma; }
	 * 
	 * @RequestMapping(value = "/user1", method = RequestMethod.POST) public
	 * ModelAndView addPerson(@RequestParam("user") String
	 * user, @RequestParam("pass") String pass) throws SQLException { ModelAndView
	 * ma = new ModelAndView(); ma.setViewName("user"); Usuario u = new
	 * Usuario(user, pass); ma.addObject("lista", usuarioService.create(u)); return
	 * ma; }
	 * 
	 * @RequestMapping(value = "/user3", method = RequestMethod.POST) public
	 * ModelAndView searchId(@RequestParam("editar") int id) throws SQLException {
	 * ModelAndView ma = new ModelAndView(); ma.setViewName("user"); // Usuario u =
	 * new Usuario(id); ma.addObject("lista1", usuarioService.read(id));
	 * System.out.println("soy el id: " + id); return ma; }
	 * 
	 * @RequestMapping(value = "/user4", method = RequestMethod.POST) public
	 * ModelAndView updatePersona(@RequestParam("user1") String
	 * user, @RequestParam("pass1") String pass) throws SQLException { ModelAndView
	 * ma = new ModelAndView(); ma.setViewName("/"); Usuario u = new Usuario(user,
	 * pass); ma.addObject("lista", usuarioService.update(u)); return ma; }
	 * 
	 * @RequestMapping(value = "/user5", method = RequestMethod.POST) public
	 * ModelAndView eliminar(@RequestParam("eliminar") int id, Model model) throws
	 * SQLException { ModelAndView ma = new ModelAndView(); ma.setViewName("user");
	 * Usuario u = new Usuario(id); ma.addObject("lista",
	 * usuarioService.delete(id)); return ma; }
	 */

}
