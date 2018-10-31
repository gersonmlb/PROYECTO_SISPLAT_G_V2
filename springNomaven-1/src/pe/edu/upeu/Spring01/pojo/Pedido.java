package pe.edu.upeu.Spring01.pojo;

public class Pedido {
	
	private int idpedido;
	private int idempleado;
	private int idsede;
	private int idcliente;
	private String fecha;
	private String nombre;
	private String codigo;
	private int cantidad;
	private double precio;
	private String dimension;
	private String especificacion;
	private String observacion;
	private String estado;
	
	public Pedido() {
		super();
	}

	public Pedido(int idpedido, int idempleado, int idsede, int idcliente, String fecha, String nombre, String codigo,
			int cantidad, double precio, String dimension, String especificacion, String observacion, String estado) {
		super();
		this.idpedido = idpedido;
		this.idempleado = idempleado;
		this.idsede = idsede;
		this.idcliente = idcliente;
		this.fecha = fecha;
		this.nombre = nombre;
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.precio = precio;
		this.dimension = dimension;
		this.especificacion = especificacion;
		this.observacion = observacion;
		this.estado = estado;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
