package test;

import java.util.List;

import com.itter.domain.Persona;

import jakarta.persistence.*;


public class HolaMundoHibernate {

	public static void main(String[] args) {
		String hql = "SELECT p FROM Persona p";
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
		EntityManager entityManager = fabrica.createEntityManager();
		
		Query query = entityManager.createQuery(hql,Persona.class);
		
		List<Persona> personas = query.getResultList();
		for(Persona p : personas) {
			System.out.println("Persona: " +p);
		}
	}
}
