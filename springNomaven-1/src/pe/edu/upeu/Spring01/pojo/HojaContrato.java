package pe.edu.upeu.Spring01.pojo;

public class HojaContrato {
	
	private int idhojacontrato;
	private int idempleado;
	private int idpedido;
	private String fecha;
	private String codigo;
	private double total;
	private double adelanto;
	private double mitadtotal;
	private String estado;
	
	public HojaContrato() {
		super();
	}
	

	public HojaContrato(int idhojacontrato, int idempleado, int idpedido, String fecha, String codigo, double total,
			double adelanto, double mitadtotal, String estado) {
		super();
		this.idhojacontrato = idhojacontrato;
		this.idempleado = idempleado;
		this.idpedido = idpedido;
		this.fecha = fecha;
		this.codigo = codigo;
		this.total = total;
		this.adelanto = adelanto;
		this.mitadtotal = mitadtotal;
		this.estado = estado;
	}

	public int getIdhojacontrato() {
		return idhojacontrato;
	}

	public void setIdhojacontrato(int idhojacontrato) {
		this.idhojacontrato = idhojacontrato;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getAdelanto() {
		return adelanto;
	}

	public void setAdelanto(double adelanto) {
		this.adelanto = adelanto;
	}

	public double getMitadtotal() {
		return mitadtotal;
	}

	public void setMitadtotal(double mitadtotal) {
		this.mitadtotal = mitadtotal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
