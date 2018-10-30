package pe.edu.upeu.Spring01.pojo;

public class EmpleadoAcceso {
	
	private int idempacc;
	private int idempleado;
	private int idacceso;
	private String estado;
	
	public EmpleadoAcceso() {
		super();
	}

	public EmpleadoAcceso(int idempacc, int idempleado, int idacceso, String estado) {
		super();
		this.idempacc = idempacc;
		this.idempleado = idempleado;
		this.idacceso = idacceso;
		this.estado = estado;
	}

	public int getIdempacc() {
		return idempacc;
	}

	public void setIdempacc(int idempacc) {
		this.idempacc = idempacc;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdacceso() {
		return idacceso;
	}

	public void setIdacceso(int idacceso) {
		this.idacceso = idacceso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
