package com.Loja_ecommerce.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
@SequenceGenerator(name = "seq_produtos",sequenceName = "seq_produtos",allocationSize = 1,initialValue = 1)
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_produtos")
	private Long id;
	
	private String nome;
	
	private Boolean ativo = Boolean.TRUE;//produto ativo 
	
	private String tipoUnidade;
	@Column(columnDefinition = "text",length = 2000)//definição da tamanho da coluna no banco de dados
	private String descricao;
	
	/*private NotaItemProduto notaproduto;*/
	
	private Double peso;
	
	private Double largura;
	
	private Double altura;
	
	private Double profundidade;
	
	private BigDecimal valorVenda = BigDecimal.ZERO; //bigdecimal temos que informa pelo objeto qual, numero deve começar
	
	private Integer quantidadeEstoque = 0; //salvar valor inicial dese atributo no banco de dados
	
	private Integer quantidaeAlertaEstoque = 0;
	
	private String linkYoutube;
	
	private Boolean alertaQuantidadeEstoque =Boolean.FALSE; // alerta de quantidade de estoque acabando false para indicar no banco que objeto não comece com alerta
	
	private Integer quantidadeClick = 0;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/*public NotaItemProduto getNotaproduto() {
		return notaproduto;
	}

	public void setNotaproduto(NotaItemProduto notaproduto) {
		this.notaproduto = notaproduto;
	}
*/
	
	
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(Double profundidade) {
		this.profundidade = profundidade;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Integer getQuantidaeAlertaEstoque() {
		return quantidaeAlertaEstoque;
	}

	public void setQuantidaeAlertaEstoque(Integer quantidaeAlertaEstoque) {
		this.quantidaeAlertaEstoque = quantidaeAlertaEstoque;
	}

	public String getLinkYoutube() {
		return linkYoutube;
	}

	public void setLinkYoutube(String linkYoutube) {
		this.linkYoutube = linkYoutube;
	}

	public Boolean getAlertaQuantidadeEstoque() {
		return alertaQuantidadeEstoque;
	}

	public void setAlertaQuantidadeEstoque(Boolean alertaQuantidadeEstoque) {
		this.alertaQuantidadeEstoque = alertaQuantidadeEstoque;
	}

	public Integer getQuantidadeClick() {
		return quantidadeClick;
	}

	public void setQuantidadeClick(Integer quantidadeClick) {
		this.quantidadeClick = quantidadeClick;
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
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	
	
}
