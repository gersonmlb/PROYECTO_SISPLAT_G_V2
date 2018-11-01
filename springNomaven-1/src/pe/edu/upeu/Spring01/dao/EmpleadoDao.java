package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface EmpleadoDao {
 public int create(Empleado empleado)throws SQLException;
 public int update(Empleado empleado);
 public int delete(int id);
 public Empleado read(int id);
 public List<Empleado> readAll();
}
