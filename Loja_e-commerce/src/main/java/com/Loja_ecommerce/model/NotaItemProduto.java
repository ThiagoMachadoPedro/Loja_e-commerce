package com.Loja_ecommerce.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	private Double quantidadeItens;
	
	private Produto produtoNota;
	
	private Double notaFiscal;

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

	public Double getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(Double notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	
	
	
	
	
}
