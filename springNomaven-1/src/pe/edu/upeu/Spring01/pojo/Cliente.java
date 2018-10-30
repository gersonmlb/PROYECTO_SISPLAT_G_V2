package pe.edu.upeu.Spring01.pojo;

public class Cliente {
	
	private int cliID;
	private String razonSocial;
	private String RUC;
	private String direccion;
	private String nombre;
	private String apellido;
	private String DNI;
	private String celular;
	private int estado;
	
	public Cliente() {
	}

	public Cliente(int cliID, String razonSocial, String rUC, String direccion, String nombre, String apellido,
			String dNI, String celular, int estado) {
		super();
		this.cliID = cliID;
		this.razonSocial = razonSocial;
		RUC = rUC;
		this.direccion = direccion;
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.celular = celular;
		this.estado = estado;
	}

	public int getCliID() {
		return cliID;
	}

	public void setCliID(int cliID) {
		this.cliID = cliID;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String rUC) {
		RUC = rUC;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}		
}
