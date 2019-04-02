package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteRemovePerfilComUsuarioAssociado {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Perfil p = manager.find(Perfil.class, 1L);
		manager.remove(p);
		manager.close();
		JPAUtil.close();
	}
}
