package com.Loja_ecommerce.enums;

public enum StatusContaPagar {
	
	
	COBRANCA("pagar"),
	VENCIDA("vencida"),
	ABERTA("aberta"),
	RENEGOCIADA("renegociavel"),
	QUITADA("quitada");
	
	private String descricao;

	private StatusContaPagar(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
	

}
