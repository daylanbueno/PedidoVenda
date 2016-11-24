package com.algaworks.pedidovenda.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
	
		EntityManagerFactory  factory= Persistence.createEntityManagerFactory("pedidoPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction txt = manager.getTransaction();
		txt.begin();
		
		Cliente  cliente = new Cliente();
		cliente.setNome("Daylan");
		cliente.setDocumentoReceiraFederal("-0000303");
		cliente.setEmail("daylansantos@gmail.com");
		cliente.setTipoPessoa(TipoPessoa.JURIDICA);
		
		
		Endereco endereco = new Endereco();
		endereco.setCep("1234556");
		endereco.setCidade("brasilia");
		endereco.setCliente(cliente);
		endereco.setComplemento("sn");
		endereco.setLogradouro("titi");
		endereco.setUf("df");
		endereco.setNumero("14A");
		
		cliente.getEnderecos().add(endereco);
		manager.persist(cliente);
		txt.commit();
		

	}

}
