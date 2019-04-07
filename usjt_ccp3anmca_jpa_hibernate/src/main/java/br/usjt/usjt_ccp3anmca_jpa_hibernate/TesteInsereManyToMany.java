package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereManyToMany {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = new Usuario ();
		u.setNome("Ana");
		u.setFone("11223344");
		u.setEmail("ana@usjt.br");
		Perfil p = new Perfil();
		p.setDescricao("Perfil da Ana");
		p.setUsuario(u);
		u.setPerfil(p);
		Conteudo conteudo = new Conteudo ();
		conteudo.setDescricao("Conteúdo consumido pela Ana");
		conteudo.setTipo("Conteúdo do tipo texto");
		Consumo consumo = new Consumo();
		consumo.setDataHora(new Date(0));
		consumo.setUsuario(u);
		consumo.setConteudo(conteudo);
		manager.persist(consumo);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}
}
