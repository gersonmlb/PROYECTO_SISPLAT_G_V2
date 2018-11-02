package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.OrdenCompra;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface OrdenCompraDao {
 public int create(OrdenCompra ordencompra)throws SQLException;
 public int update(OrdenCompra ordencompra);
 public int delete(int id);
 public OrdenCompra read(int id);
 public List<OrdenCompra> readAll();
}
