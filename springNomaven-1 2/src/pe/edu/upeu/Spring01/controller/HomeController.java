package pe.edu.upeu.Spring01.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.UsuarioService;


@Controller
public class HomeController {

	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(value="/user")
	public ModelAndView  listar() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("user");
		//List<Usuario> list = usuarioService.readAll();
		ma.addObject("lista", usuarioService.readAll());
		return ma;
	}
	
	@RequestMapping(value = "/user1", method = RequestMethod.POST)
	public ModelAndView addPerson(@RequestParam("user") String user, @RequestParam("pass") String pass) throws SQLException {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("user");
		Usuario u = new Usuario(user,pass);
		ma.addObject("lista", usuarioService.create(u));
		return ma;
	}
	
	@RequestMapping(value = "/user3", method = RequestMethod.POST)
	public  ModelAndView searchId(@RequestParam("editar") int id) throws SQLException {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("update");
		//Usuario u = new Usuario(id);
		ma.addObject("lista1", usuarioService.read(id));
		System.out.println("soy el id: " + id);
		return ma;
	}
	
	@RequestMapping(value = "/user4", method = RequestMethod.POST)
	public ModelAndView updatePersona(@RequestParam("user1") String user, @RequestParam("pass1") String pass) throws SQLException {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("/");
		Usuario u = new Usuario(user,pass);
		ma.addObject("lista", usuarioService.update(u));
		return ma;
	}

	@RequestMapping(value = "/user5", method = RequestMethod.POST)
	public ModelAndView eliminar(@RequestParam("eliminar") int id, Model model) throws SQLException {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("user");
		//Usuario u = new Usuario(id);
		ma.addObject("lista", usuarioService.delete(id));
		return ma;
	}
	
}






