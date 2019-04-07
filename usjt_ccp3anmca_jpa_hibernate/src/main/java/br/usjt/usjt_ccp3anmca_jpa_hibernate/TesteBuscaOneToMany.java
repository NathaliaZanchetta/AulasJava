package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;

public class TesteBuscaOneToMany {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Feedback f = manager.find(Feedback.class, 8L);
		System.out.println(f.getConsumos());
		manager.close();
		JPAUtil.close();
	}
}
