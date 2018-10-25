package pe.edu.upeu.Spring01.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.UsuarioService;

public class Pruebas {
	public static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/springmvc-servlet.xml");
	public static UsuarioService us = (UsuarioService) applicationContext.getBean("usuarioServiceImp");
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
	/*	UsuarioService us = (UsuarioService) applicationContext.getBean("usuarioServiceImp");
		List<Usuario> ls = new ArrayList<>();
		ls = us.readAll();
		for(int i = 0; i<ls.size();i++) {
			System.out.println(ls.get(i).getNomuser());
		}*/
		editar();
		
			//System.out.println(us.delete(3));
	}
	//System.out.println(us.create(new Usuario(1,"jonas","789","1")));
			public static void	editar() {
				System.out.println(us.update(new Usuario(8,"jonas","909","1")));
					
			}

}
