package sneaker_shop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sneaker_shop.models.user.User;

@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public User findUserByPasswordAndLogin(String login, String password) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM users WHERE login=:login AND password=:password")
                .setParameter("password", password)
                .setParameter("login", login);
        User user = (User) query.getSingleResult();
        return user;
    }

    public User getUserById(int id){
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        return user;
    }

    public boolean createOrUpdate(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
        return true;
    }


    public boolean delete(User user){
        Transaction transaction = null;
        try(Session session = sessionFactory.getCurrentSession()){
            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();
            return true;
        }
        catch (Exception e){
            transaction.rollback();
        }
        return false;
    }

}
