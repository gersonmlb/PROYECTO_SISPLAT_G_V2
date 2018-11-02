package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface EmpleadoService {
 public int create(Empleado empleado)throws SQLException;
 public int update(Empleado empleado);
 public int delete(int id);
 public Empleado read(int id);
 public List<Empleado> readAll();
}
