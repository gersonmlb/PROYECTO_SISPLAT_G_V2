package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.HojaContrato;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface HojaContratoService {
 public int create(HojaContrato hojacontrato)throws SQLException;
 public int update(HojaContrato hojacontrato);
 public int delete(int id);
 public HojaContrato read(int id);
 public List<HojaContrato> readAll();
}
