package test;

import com.itter.dao.PersonaDAO;
import com.itter.domain.Persona;

public class OperacionesHibernateJPA {

	public static void main(String[] args) {
		PersonaDAO personaDao = new PersonaDAO();
		personaDao.listar();
		
		Persona persona = new Persona();
		persona.setIdPersona(3);
		persona = personaDao.buscarPersonaPorId(persona);
		System.out.println("Persona encontrada: " +persona);
		//persona.setNombre("Morena");
		//persona.setApellido("Quinteros");
		//persona.setTelefono("4553211");
		//persona.setEmail("yani@gmail.com");
		
		//personaDao.modificar(persona);
		
		personaDao.eliminar(persona);
		personaDao.listar();
		
		//personaDao.insertar(persona);
	}
}
