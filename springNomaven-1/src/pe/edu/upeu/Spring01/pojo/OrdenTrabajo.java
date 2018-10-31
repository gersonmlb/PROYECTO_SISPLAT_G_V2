package pe.edu.upeu.Spring01.pojo;

public class OrdenTrabajo {
	
	private int idordentra;
	private int idempleado;
	private int idpedido;
	private String fechainicio;
	private String fechafin;
	private String codigo;
	private String fechaActual;
	private String estado;
	
	public OrdenTrabajo() {
		super();
	}

	public OrdenTrabajo(int idordentra, int idempleado, int idpedido, String fechainicio, String fechafin,
			String codigo, String fechaActual, String estado) {
		super();
		this.idordentra = idordentra;
		this.idempleado = idempleado;
		this.idpedido = idpedido;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.codigo = codigo;
		this.fechaActual = fechaActual;
		this.estado = estado;
	}

	public int getIdordentra() {
		return idordentra;
	}

	public void setIdordentra(int idordentra) {
		this.idordentra = idordentra;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public String getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(String fechainicio) {
		this.fechainicio = fechainicio;
	}

	public String getFechafin() {
		return fechafin;
	}

	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(String fechaActual) {
		this.fechaActual = fechaActual;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
