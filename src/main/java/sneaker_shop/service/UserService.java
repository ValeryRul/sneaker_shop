package sneaker_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sneaker_shop.dao.UserDao;
import sneaker_shop.models.user.User;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public boolean createOrUpdateUser(User user){
        return userDao.createOrUpdate(user);
    }

    @Transactional
    public boolean deleteUser(User user){
        return userDao.delete(user);
    }

//    public boolean setUserRoot(User user, String root){
//        for(Root root1: Root.values()){
//            if(root.equalsIgnoreCase(root1.toString())){
//                user.setRoot(root);
//            }
//        }
//        return userDao.createOrUpdate(user);
//    }

    public boolean setUserSubscriptionDiscount(User user){
        user.setSubscriptionDiscount(false);
        return userDao.createOrUpdate(user);
    }

    @Transactional
    public User getUserByLoginAndPassword(String login, String password){
        return userDao.findUserByPasswordAndLogin(login, password);
    }

    @Transactional
    public User getById(int id){
        return userDao.getUserById(id);
    }
}
