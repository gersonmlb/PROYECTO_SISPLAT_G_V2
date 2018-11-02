package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.Producto;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface ProductoDao {
 public int create(Producto producto)throws SQLException;
 public int update(Producto producto);
 public int delete(int id);
 public Producto read(int id);
 public List<Producto> readAll();
}
