package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteAtualizaUsuario {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = manager.find(Usuario.class, 1L);
		u.setNome(u.getNome() + " da Silva");
		u.setEmail("anasilva@usjt.br");
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}