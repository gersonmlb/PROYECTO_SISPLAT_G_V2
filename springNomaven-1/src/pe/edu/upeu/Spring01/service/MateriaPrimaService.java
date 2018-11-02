package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.MateriaPrima;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface MateriaPrimaService {
 public int create(MateriaPrima materiaprima)throws SQLException;
 public int update(MateriaPrima materiaprima);
 public int delete(int id);
 public MateriaPrima read(int id);
 public List<MateriaPrima> readAll();
}
