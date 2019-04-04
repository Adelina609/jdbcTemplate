package ru.kpfu.itis.springControllers.repository;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.springControllers.model.User;

import javax.persistence.*;
import java.util.List;

@Repository
public class UserRepositoryJpql implements IRepositoryJpql {

    @PersistenceUnit
    static
    EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void save(User user){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.flush();
        em.getTransaction().commit();
    }

    public void deleteUser(String email) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("DELETE FROM user WHERE user.email =: email");
        query.setParameter("email", email);
        query.executeUpdate();
        em.flush();
    }

    public User getUser(String email){
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT username FROM user WHERE user.email =:email");
        query.setParameter("email", email);
        return (User) query.getSingleResult();
    }

    public void updateUserName(String username){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("UPDATE user SET user.username =:username");
        query.executeUpdate();
        em.flush();
    }
}
