package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.Pedido;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface PedidoDao {
 public int create(Pedido pedido)throws SQLException;
 public int update(Pedido pedido);
 public int delete(int id);
 public Pedido read(int id);
 public List<Pedido> readAll();
}
