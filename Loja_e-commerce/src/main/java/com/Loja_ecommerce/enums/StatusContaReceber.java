package com.Loja_ecommerce.enums;

public enum StatusContaReceber {
	
	
	COBRANCA("pagar"),
	VENCIDA("vencida"),
	ABERTA("aberta"),
	QUITADA("quitada");
	
	private String descricao;

	private StatusContaReceber(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
	

}
