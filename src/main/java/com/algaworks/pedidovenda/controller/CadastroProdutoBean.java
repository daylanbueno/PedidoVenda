package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.pedidovenda.model.Categoria;
import com.algaworks.pedidovenda.model.Produto;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<Categoria> categoriasRaizes;
	
	@Inject
	private EntityManager manager;
	
	private Produto protudo;
	
	public CadastroProdutoBean() {
		protudo = new Produto();
		
	}
	
	@PostConstruct
	public void initicalizacao(){
		System.out.println("inicializando...!");
		categoriasRaizes =manager.createQuery("from Categoria",Categoria.class).getResultList();
	}
	
	public void Salvar(){
		
	}


	public Produto getProtudo() {
		return protudo;
	}


	public void setProtudo(Produto protudo) {
		this.protudo = protudo;
	}


	public List<Categoria> getCategoriasRaizes() {
		return categoriasRaizes;
	}
	
	

}
