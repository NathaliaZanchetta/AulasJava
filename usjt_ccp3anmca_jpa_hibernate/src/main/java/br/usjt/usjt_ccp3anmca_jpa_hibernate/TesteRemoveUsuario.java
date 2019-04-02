package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteRemoveUsuario {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = manager.find(Usuario.class, 1L);
		manager.remove(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}