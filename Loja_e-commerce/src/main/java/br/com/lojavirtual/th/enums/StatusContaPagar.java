package br.com.lojavirtual.th.enums;

public enum StatusContaPagar {
	
	
	COBRANCA("pagar"),
	VENCIDA("vencida"),
	ABERTA("aberta"),
	ALUGUEL("aluguel"),
	FUNCIONARIOS("funcionarios"),
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
