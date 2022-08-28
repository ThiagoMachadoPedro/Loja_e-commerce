package com.Loja_ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	private String CNPJ;
	private String insEstadual;
	private String insMunicipal;
	private String nomeFantasia;
	private String razaoSocial;
	private String categoria;
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getInsEstadual() {
		return insEstadual;
	}
	public void setInsEstadual(String insEstadual) {
		this.insEstadual = insEstadual;
	}
	public String getInsMunicipal() {
		return insMunicipal;
	}
	public void setInsMunicipal(String insMunicipal) {
		this.insMunicipal = insMunicipal;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	

}
