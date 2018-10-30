package pe.edu.upeu.Spring01.pojo;

public class DetalleVenta {

	private int iddetventa;
	private int idventa;
	private int idproducto;
	private double precio;
	private int cantidad;
	private double importe;
	private String estado;
	
	public DetalleVenta() {
		super();
	}

	public DetalleVenta(int iddetventa, int idventa, int idproducto, double precio, int cantidad, double importe,
			String estado) {
		super();
		this.iddetventa = iddetventa;
		this.idventa = idventa;
		this.idproducto = idproducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.importe = importe;
		this.estado = estado;
	}

	public int getIddetventa() {
		return iddetventa;
	}

	public void setIddetventa(int iddetventa) {
		this.iddetventa = iddetventa;
	}

	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
