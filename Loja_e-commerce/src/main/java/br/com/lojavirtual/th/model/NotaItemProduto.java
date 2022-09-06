package br.com.lojavirtual.th.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
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
@Table(name = "nota_item_produto")
@SequenceGenerator(name = "seq_nota_item_produto",sequenceName = "seq_nota_item_produto",allocationSize = 1,initialValue = 1)
public class NotaItemProduto implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_nota_item_produto")
	private Long id;
	@Column(nullable = false)
	private Double quantidadeItens;
	
	@ManyToOne
	@JoinColumn(name = "produto_id", nullable = false, 
	foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
	private Produto produtoNota;
	
	@ManyToOne
	@JoinColumn(name = "nota_fical_compra_id", nullable = false, 
	foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_compra_fk"))
	private NotaFiscalCompra notaFiscal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(Double quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public Produto getProdutoNota() {
		return produtoNota;
	}

	public void setProdutoNota(Produto produtoNota) {
		this.produtoNota = produtoNota;
	}

	public NotaFiscalCompra getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscalCompra notaFiscal) {
		this.notaFiscal = notaFiscal;
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
		NotaItemProduto other = (NotaItemProduto) obj;
		return Objects.equals(id, other.id);
	}

	
	
}
