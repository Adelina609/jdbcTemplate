package ru.kpfu.itis.springControllers.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.kpfu.itis.springControllers.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UserRepositoryCriteriaImpl implements UserRepositoryCriteria {

    @PersistenceUnit
    static
    EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }


    public void createUser(User user){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public void update(User user){
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaUpdate<User> criteriaUpdate = cb.createCriteriaUpdate(User.class);
        Root<User> root = criteriaUpdate.from(User.class);
        criteriaUpdate.set("username", user.getName());
        criteriaUpdate.where(cb.equal(root.get("email"), user.getEmail()));
        getEntityManager().createQuery(criteriaUpdate).executeUpdate();
        getEntityManager().getTransaction().commit();
    }

    public void delete(User user){
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaDelete<User> criteriaDelete = cb.createCriteriaDelete(User.class);
        Root<User> root = criteriaDelete.from(User.class);
        criteriaDelete.where(cb.greaterThan(root.get("email"), user.getEmail()));
        getEntityManager().createQuery(criteriaDelete).executeUpdate();
        getEntityManager().getTransaction().commit();
    }

    public User get(String email){
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<User> criteriaDelete = cb.createQuery(User.class);
        Root<User> root = criteriaDelete.from(User.class);
        criteriaDelete.select(root);
        criteriaDelete.where(cb.greaterThan(root.get("email"), email));
        return getEntityManager().createQuery(criteriaDelete).getSingleResult();
    }

    @Override
    public List<User> findUserByEmails(Set<String> emails) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> user = query.from(User.class);

        Path<String> emailPath = user.get("email");

        List<Predicate> predicates = new ArrayList<>();
        for (String email : emails) {
            predicates.add(cb.like(emailPath, email));
        }
        query.select(user)
                .where(cb.or(predicates.toArray(new Predicate[0])));

        return getEntityManager().createQuery(query)
                .getResultList();
    }
}
