package com.saludable.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comida")
public class Food {
	
	@Id
	@Column(name="id_comida")
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer id;
	

	
	 @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    private User user;
	
	
	@Column
	private String tipoComida;
	
	@Column
	private String comidaPrincipal;
	
	@Column
	private String bebida;
	
	@Column	
	private Boolean postre; 
	
	@Column
	private String comioPostre;
	@Column(name="otro_alimento")
	private Boolean otroAlimento;
	
	@Column(name="que_alimento")
	private String queAlimento;
	
	@Column
	private Boolean hambre;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public String getComidaPrincipal() {
		return comidaPrincipal;
	}

	public void setComidaPrincipal(String comidaPrincipal) {
		this.comidaPrincipal = comidaPrincipal;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public Boolean getPostre() {
		return postre;
	}

	public void setPostre(Boolean postre) {
		this.postre = postre;
	}

	public String getComioPostre() {
		return comioPostre;
	}

	public void setComioPostre(String comioPostre) {
		this.comioPostre = comioPostre;
	}

	public Boolean getOtroAlimento() {
		return otroAlimento;
	}

	public void setOtroAlimento(Boolean otroAlimento) {
		this.otroAlimento = otroAlimento;
	}

	public String getQueAlimento() {
		return queAlimento;
	}

	public void setQueAlimento(String queAlimento) {
		this.queAlimento = queAlimento;
	}

	public Boolean getHambre() {
		return hambre;
	}

	public void setHambre(Boolean hambre) {
		this.hambre = hambre;
	}

	
	
	

}
