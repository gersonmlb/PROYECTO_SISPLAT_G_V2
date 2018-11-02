package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface EmpleadoAccesoService {
 public int create(EmpleadoAcceso empleadoacceso)throws SQLException;
 public int update(EmpleadoAcceso empleadoacceso);
 public int delete(int id);
 public EmpleadoAcceso read(int id);
 public List<EmpleadoAcceso> readAll();
}
