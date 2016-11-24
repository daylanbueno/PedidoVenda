package com.algaworks.pedidovenda.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Produto;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private Produto protudo;
	
	public CadastroProdutoBean() {
		protudo = new Produto();
		
	}
	
	
	public void Salvar(){
		
	}


	public Produto getProtudo() {
		return protudo;
	}


	public void setProtudo(Produto protudo) {
		this.protudo = protudo;
	}
	
	

}
