package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Maria da Silva", "maria@gmail.com");
        Pessoa p3 = new Pessoa(null, "Joao da Silva", "joao@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-persistence");
        EntityManager em = emf.createEntityManager();

        //Procurar pessoa com ID 2
        Pessoa pFind = em.find(Pessoa.class, 2);
        System.out.println(pFind);

        //Remover pessoa com ID 2 - Sempre colocar transacao quando nao for consulta
        em.getTransaction().begin();
        Pessoa pDelete = em.find(Pessoa.class, 2);
        em.remove(pDelete);
        em.getTransaction().commit();

        //Gravar no banco
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Foi");

        em.close();
        emf.close();
    }
}