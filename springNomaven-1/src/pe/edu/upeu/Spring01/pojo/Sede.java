package pe.edu.upeu.Spring01.pojo;

public class Sede {

	private int idsede;
	private String nombre;
	private String estado;
	
	public Sede() {
		super();
	}

	public Sede(int idsede, String nombre, String estado) {
		super();
		this.idsede = idsede;
		this.nombre = nombre;
		this.estado = estado;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
}
