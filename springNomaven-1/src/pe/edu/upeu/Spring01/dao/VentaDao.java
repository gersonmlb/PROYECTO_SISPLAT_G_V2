package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.pojo.Venta;

public interface VentaDao {
 public int create(Venta venta)throws SQLException;
 public int update(Venta venta);
 public int delete(int id);
 public Venta read(int id);
 public List<Venta> readAll();
}
