package pe.edu.upeu.Spring01.pojo;

public class Venta {

	private int idventa;
	private int idempleado;
	private int idsede;
	private int idcliente;
	private int idhct;
	private String fecha;
	private String tipopago;
	private double total;
	private double igv;
	private double subtotal;
	private String tipodoc;
	private String numero;
	private String serie;
	private String estado;
	
	public Venta() {
	 super();
	}
	

	public Venta(int idventa, int idempleado, int idsede, int idcliente, int idhct, String fecha, String tipopago,
			double total, double igv, double subtotal, String tipodoc, String numero, String serie, String estado) {
		super();
		this.idventa = idventa;
		this.idempleado = idempleado;
		this.idsede = idsede;
		this.idcliente = idcliente;
		this.idhct = idhct;
		this.fecha = fecha;
		this.tipopago = tipopago;
		this.total = total;
		this.igv = igv;
		this.subtotal = subtotal;
		this.tipodoc = tipodoc;
		this.numero = numero;
		this.serie = serie;
		this.estado = estado;
	}


	public Venta(int idventa, int idempleado, int idsede, int idcliente, int idhct, String fecha, String tipopago,
			double total, String tipodoc, String numero, String serie, String estado) {
		super();
		this.idventa = idventa;
		this.idempleado = idempleado;
		this.idsede = idsede;
		this.idcliente = idcliente;
		this.idhct = idhct;
		this.fecha = fecha;
		this.tipopago = tipopago;
		this.total = total;
		this.tipodoc = tipodoc;
		this.numero = numero;
		this.serie = serie;
		this.estado = estado;
	}

	public Venta(int idventa, int idempleado, int idsede, int idcliente, String fecha, String tipopago, double total,
			double igv, double subtotal, String tipodoc, String numero, String serie, String estado) {
		super();
		this.idventa = idventa;
		this.idempleado = idempleado;
		this.idsede = idsede;
		this.idcliente = idcliente;
		this.fecha = fecha;
		this.tipopago = tipopago;
		this.total = total;
		this.igv = igv;
		this.subtotal = subtotal;
		this.tipodoc = tipodoc;
		this.numero = numero;
		this.serie = serie;
		this.estado = estado;
	}

	
	

	public Venta(int idventa, int idempleado, int idsede, int idcliente,  String fecha, String tipopago,
			double total, String tipodoc, String numero, String serie, String estado) {
		super();
		this.idventa = idventa;
		this.idempleado = idempleado;
		this.idsede = idsede;
		this.idcliente = idcliente;
		this.idhct = idhct;
		this.fecha = fecha;
		this.tipopago = tipopago;
		this.total = total;
		this.tipodoc = tipodoc;
		this.numero = numero;
		this.serie = serie;
		this.estado = estado;
	}


	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
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

	public int getIdhct() {
		return idhct;
	}

	public void setIdhct(int idhct) {
		this.idhct = idhct;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipopago() {
		return tipopago;
	}

	public void setTipopago(String tipopago) {
		this.tipopago = tipopago;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
 