package pe.edu.upeu.Spring01.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.daoImp.UsuarioDaoImp;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.UsuarioService;

public class Pruebas {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/springmvc-servlet.xml");
		UsuarioService us = (UsuarioService) applicationContext.getBean("usuarioServiceImp");
		List<Usuario> ls = new ArrayList<>();
		ls = us.readAll();
		for(int i = 0; i<ls.size();i++) {
			System.out.println(ls.get(i).getNomuser());
		}
		//System.out.println(us.create(new Usuario(1,"jonas","789","1")));
		//System.out.println(us.update(new Usuario(3,"jonas","909","1")));
		System.out.println(us.delete(3));
	}

}
