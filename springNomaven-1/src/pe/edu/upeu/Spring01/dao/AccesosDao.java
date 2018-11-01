package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Accesos;
import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface AccesosDao {
 public int create(Accesos accesos)throws SQLException;
 public int update(Accesos accesos);
 public int delete(int id);
 public Accesos read(int id);
 public List<Accesos> readAll();
}
