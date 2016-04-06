package sc.senai.br.aluno.test;

import javax.persistence.EntityManager;

import sc.senai.br.aluno.factory.JpaUtils;
import sc.senai.br.aluno.model.Aluno;


public class Teste {

	public static void main(String[] args) {

		JpaUtils.getInstance().createEntityManagerFactory();
		EntityManager em = JpaUtils.getInstance().getEntityManager();
		em.getTransaction().begin();
		
		// Adicionando aluno;
		Aluno alu = new Aluno();
		
		alu.setNome("Maciel Leandro da Silva");
		alu.setIdade(35);
		alu.getEndereco().setRua("Jose Vicente Rosa");
		alu.getEndereco().setNumero(413);
		alu.getEndereco().setBairro("Forquilinhas");
		
		///////////////////////////////////////////////
		
		em.persist(alu);
		em.getTransaction().commit();
		em.close();
		JpaUtils.getInstance().closeFactory();

	}

}
