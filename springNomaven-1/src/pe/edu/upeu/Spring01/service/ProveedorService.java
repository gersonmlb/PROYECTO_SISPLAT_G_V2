package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.Proveedor;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface ProveedorService {
 public int create(Proveedor proveedor)throws SQLException;
 public int update(Proveedor proveedor);
 public int delete(int id);
 public Proveedor read(int id);
 public List<Proveedor> readAll();
}
