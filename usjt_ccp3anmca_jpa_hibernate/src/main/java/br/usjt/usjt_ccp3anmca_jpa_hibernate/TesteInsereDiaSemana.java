package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereDiaSemana {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		TesteDiasSemanas dia = new TesteDiasSemanas();
		dia.setDiaSemana("Segunda-feira");
		//dia.setDiaSemana("Terça-feira");
		//dia.setDiaSemana("Quarta-feira");
		//dia.setDiaSemana("Quinta-feira");
		//dia.setDiaSemana("Sexta-feira");
		manager.persist(dia);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
