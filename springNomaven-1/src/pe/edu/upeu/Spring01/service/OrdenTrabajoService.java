package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.OrdenTrabajo;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface OrdenTrabajoService {
 public int create(OrdenTrabajo ordentrabajo)throws SQLException;
 public int update(OrdenTrabajo ordentrabajo);
 public int delete(int id);
 public OrdenTrabajo read(int id);
 public List<OrdenTrabajo> readAll();
}
