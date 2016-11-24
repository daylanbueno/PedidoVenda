package com.algaworks.util.jpa;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {

	private EntityManagerFactory factory;
	
	public EntityManagerProducer(){
		factory = Persistence.createEntityManagerFactory("pedidoPU");
	}
	
	@Produces @RequestScoped
	public EntityManager createEntityManage(){
		return factory.createEntityManager();
	}
	
	public void closeEntityManage(@Disposes EntityManager manage){
		manage.close();
	}
}
