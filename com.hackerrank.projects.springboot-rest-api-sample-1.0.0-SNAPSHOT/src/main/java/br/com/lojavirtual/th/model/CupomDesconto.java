package br.com.lojavirtual.th.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cupom_desconto")
@SequenceGenerator(name = "seq_cupom_desconto",initialValue = 1,allocationSize = 1,sequenceName = "seq_cupom_desconto")
public class CupomDesconto implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_cupom_desconto")
	private Long id;
	@Column(nullable = false)
	private String codDesconto;
	
	private BigDecimal valorDesconto;
	
	private BigDecimal valorPorcentagemDesconto;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date validadeCupom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodDesconto() {
		return codDesconto;
	}

	public void setCodDesconto(String codDesconto) {
		this.codDesconto = codDesconto;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorPorcentagemDesconto() {
		return valorPorcentagemDesconto;
	}

	public void setValorPorcentagemDesconto(BigDecimal valorPorcentagemDesconto) {
		this.valorPorcentagemDesconto = valorPorcentagemDesconto;
	}

	public Date getValidadeCupom() {
		return validadeCupom;
	}

	public void setValidadeCupom(Date validadeCupom) {
		this.validadeCupom = validadeCupom;
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
		CupomDesconto other = (CupomDesconto) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
