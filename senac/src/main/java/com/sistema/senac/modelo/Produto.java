package com.sistema.senac.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public long getId() {
		return id;
	}

	private String nome;
	private String codigobarras;
	private String unidadeMedida;
	private Double estoque;
	private Double precoCusto;
	private Double precoVenda;
	private Double lucro;
	private Double margemLucro;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigobarras() {
		return codigobarras;
	}
	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public Double getEstoque() {
		return estoque;
	}
	public void setEstoque(Double estoque) {
		this.estoque = estoque;
	}
	public Double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public Double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public Double getLucro() {
		return lucro;
	}
	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}
	public Double getMargemLucro() {
		return margemLucro;
	}
	public void setMargemLucro(Double margemLucro) {
		this.margemLucro = margemLucro;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setId(long id) {
		this.id = id;
	}

	
}
