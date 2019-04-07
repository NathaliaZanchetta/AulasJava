package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;

public class TesteBuscaPerfilComUsuarioAssociado {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Perfil p = manager.find(Perfil.class, 1L);
		System.out.println(p.getUsuario().getNome());
		manager.close();
		JPAUtil.close();
	}
}