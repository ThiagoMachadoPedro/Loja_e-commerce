package com.Loja_ecommerce.model;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="endereco")
@SequenceGenerator(name ="seq_endereco",initialValue = 1,allocationSize = 1,sequenceName = "seq_endereco" )
public class Endereco implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_endereco")
	private Long id;
	private String ruaLogradora;
	private String cep;																												
	private String numero;
	private String comprimento;
	private String bairro;
	private String uf;
	private String cidade;
	@ManyToOne(targetEntity = Pessoa.class) // mutos endereços pra uma pessoa e salvará no banco de dados como pessoa 
	@JoinColumn(name="pessoa_id",nullable = false,foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name= "pessoa_fk"))// para usar a Classe Pessoa para colocar colunas em pessoa
	private Pessoa pessoa;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRuaLogradora() {
		return ruaLogradora;
	}
	public void setRuaLogradora(String ruaLogradora) {
		this.ruaLogradora = ruaLogradora;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComprimento() {
		return comprimento;
	}
	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
