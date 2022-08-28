package com.Loja_ecommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id") /*
									 * com essa anotação estou indicando que pessoa fisica usara atributos de Pessoa
									 * do nosso sistema pra não recrias colunas em vão.Como indicara id de uma class
									 * abstrata não precisará ter um id essa class
									 * 
									 */
public class PessoaFisica extends Pessoa {

	@Column(nullable = false)
	private String cpf;

	@Temporal(TemporalType.DATE) // pra trabalhar com data
	private Date dataNascimento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
