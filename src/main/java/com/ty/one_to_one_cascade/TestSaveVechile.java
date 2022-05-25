package com.ty.one_to_one_cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVechile {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Charcy charcy = new Charcy();
		charcy.setCharcyNumber("IND1245555");
		charcy.setType("car");
	
		Vehicle vehicle = new Vehicle();
		vehicle.setName("mustang");
		vehicle.setCost(12345);
		vehicle.setCharcy(charcy);
		
		charcy.setVehicle(vehicle);
		
		entityTransaction.begin();
		
		entityManager.persist(vehicle);
		
		entityTransaction.commit();
		
	}

}
