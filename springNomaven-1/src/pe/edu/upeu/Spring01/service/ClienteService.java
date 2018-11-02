package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Accesos;
import pe.edu.upeu.Spring01.pojo.Cliente;
import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface ClienteService {
 public int create(Cliente cliente)throws SQLException;
 public int update(Cliente cliente);
 public int delete(int id);
 public Cliente read(int id);
 public List<Cliente> readAll();
}
