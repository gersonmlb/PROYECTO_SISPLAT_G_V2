package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface KardexProductoService {
 public int create(KardexProducto kardexpro)throws SQLException;
 public int update(KardexProducto kardexpro);
 public int delete(int id);
 public KardexProducto read(int id);
 public List<KardexProducto> readAll();
}
