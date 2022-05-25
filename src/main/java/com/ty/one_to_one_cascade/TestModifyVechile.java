package com.ty.one_to_one_cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestModifyVechile {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		 Vehicle vehicle = entityManager.find(Vehicle.class, 3);
		 
		 if(vehicle!=null) {
			 Charcy charcy = vehicle.getCharcy();
			 vehicle.setName("GT Cobra");
		 }
	}

}
