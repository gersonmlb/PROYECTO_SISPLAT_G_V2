package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Usuario;

public interface UsuarioService {
	 public int create(Usuario user)throws SQLException;
	 public int update(Usuario user);
	 public int delete(int id);
	 public Usuario read(int id);
	 public List<Usuario> readAll();
}
