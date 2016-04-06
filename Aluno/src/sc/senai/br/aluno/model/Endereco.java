package sc.senai.br.aluno.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Endereco", schema = "aluno_db")
public class Endereco implements Serializable{

	private static final long serialVersionUID = 3114191247724492732L;
	/**
	 *  Atributos da Classe
	 */
	private long id;
	private String rua;
	private int numero;
	private String bairro;
	
	
	/**
	 *  Metodo Construtor vazio
	 */
	public Endereco() {	
	}


	/**
	 *  Metodos Gets e Sets
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}


	@Column(name = "Rua", length = 100, nullable = false)
	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}


	@Column(name = "Numero", length = 5, nullable = false)
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}


	@Column(name = "Bairro", length = 100, nullable = false)
	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	

}
