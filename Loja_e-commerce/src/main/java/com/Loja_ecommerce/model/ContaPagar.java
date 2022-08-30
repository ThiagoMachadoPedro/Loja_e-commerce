package com.Loja_ecommerce.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.Loja_ecommerce.enums.StatusContaPagar;

@Entity
@Table(name = "conta_pagar")
@SequenceGenerator(name = "seq_conta_pagar", sequenceName = "seq_conta_pagar", initialValue = 1, allocationSize = 1)
public class ContaPagar implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_pagar")
	private long id;

	private String descricao;

	private BigDecimal valorTotal;

	private BigDecimal valorDesconto;

	@Enumerated(EnumType.STRING)
	private StatusContaPagar statusContaPagar;
	
	@ManyToOne(targetEntity = Pessoa.class) // mutos endereços pra uma pessoa e salvará no banco de dados como pessoa
	@JoinColumn(name = "pessoa_form_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_form_fk"))
	private Pessoa pessoa_Fornecedor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public StatusContaPagar getStatusContaPagar() {
		return statusContaPagar;
	}

	public void setStatusContaPagar(StatusContaPagar statusContaPagar) {
		this.statusContaPagar = statusContaPagar;
	}

	public Pessoa getPessoa_Fornecedor() {
		return pessoa_Fornecedor;
	}

	public void setPessoa_Fornecedor(Pessoa pessoa_Fornecedor) {
		this.pessoa_Fornecedor = pessoa_Fornecedor;
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
		ContaPagar other = (ContaPagar) obj;
		return id == other.id;
	}
	
	
	
}
