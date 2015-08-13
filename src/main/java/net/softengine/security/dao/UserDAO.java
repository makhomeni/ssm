package net.softengine.security.dao;

import net.softengine.security.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface UserDAO {
    public boolean save(User user);

    public boolean update(User user);

    public boolean delete(User user);

    public User getUser(Long id);

    public User getUser(String query);

    public List<User> findAllUser();

    public List<User> findAllUser(String query);
}