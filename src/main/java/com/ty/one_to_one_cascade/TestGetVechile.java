package com.ty.one_to_one_cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVechile {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Vehicle vehicle = entityManager.find(Vehicle.class, 4);
		
		if(vehicle != null) {
			Charcy charcy = vehicle.getCharcy();
			
			System.out.println("Vehile name is "+vehicle.getName());
			
			System.out.println("Charcy number is "+charcy.getCharcyNumber());
		}
		else {
			System.out.println("No vechile found");
		}

	}

}
