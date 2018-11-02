package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.Sede;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface SedeService {
 public int create(Sede sede)throws SQLException;
 public int update(Sede sede);
 public int delete(int id);
 public Sede read(int id);
 public List<Sede> readAll();
}
