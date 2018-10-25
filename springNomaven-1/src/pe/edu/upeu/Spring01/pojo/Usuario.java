package pe.edu.upeu.Spring01.pojo;

public class Usuario {
	private int iduser;
	private String nomuser;
	private String clave;
	private String estado;
	
	
	
	
	public Usuario(int iduser) {
		super();
		this.iduser = iduser;
	}
	public Usuario(String nomuser, String clave) {
		super();
		this.nomuser = nomuser;
		this.clave = clave;
	}
	public Usuario(int iduser, String nomuser, String clave, String estado) {
		super();
		this.iduser = iduser;
		this.nomuser = nomuser;
		this.clave = clave;
		this.estado = estado;
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getNomuser() {
		return nomuser;
	}
	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
