package br.univel.cadastro.model;

public enum UF {
	PR("Paraná"),
	SP("São Paulo"),
	SC("Santa Catarina");
	
	private String nome;
	
	public String getNome(){
		return nome;
	}
	
	private UF(String nome){
		this.nome = nome;
	}
}
