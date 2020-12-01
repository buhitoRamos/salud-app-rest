package com.saludable.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="comida")
public class Food {
	
	
	
	@Id
	@Column(name="id_comida")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer id;
	

	
	@Column
	private int user_id;
	
	private String nombre;
	
	private String apellido;
	
	@Column
	private String tipo_comida;
	
	@Column
	private String comida_principal;
	
	@Column
	private String comida_secundaria;
	
	@Column
	private String bebida;
	
	@Column	
	private Boolean ingirio_postre; 
	
	@Column
	private String postre;	
	
	
	@Column
	private Boolean hambre;
	
	@Column
	private String fecha_hora;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
	public String getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public String getBebida() {
		return bebida;
	}
	public String getComida_principal() {
		return comida_principal;
	}
	public String getComida_secundaria() {
		return comida_secundaria;
	}
	 public Boolean getHambre() {
		return hambre;
	}
	 public Integer getId() {
		return id;
	}
	 public Boolean getIngirio_postre() {
		return ingirio_postre;
	}
	
	 public String getPostre() {
		return postre;
	}
	 
	 public String getTipo_comida() {
		return tipo_comida;
	}
	 public String getApellido() {
		return apellido;
	}
	 public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	 public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public void setTipo_comida(String tipo_comida) {
		this.tipo_comida = tipo_comida;
	}
	public void setComida_principal(String comida_principal) {
		this.comida_principal = comida_principal;
	}
	public void setComida_secundaria(String comida_secundaria) {
		this.comida_secundaria = comida_secundaria;
	}
	public void setIngirio_postre(Boolean ingirio_postre) {
		this.ingirio_postre = ingirio_postre;
	}
	public void setPostre(String postre) {
		this.postre = postre;
	}
	
	public void setHambre(Boolean hambre) {
		this.hambre = hambre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
