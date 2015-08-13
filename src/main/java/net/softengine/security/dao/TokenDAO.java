package net.softengine.security.dao;

import net.softengine.security.model.Token;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Token: SHAHIN_PC
 * Date: 8/12/15
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */

public interface TokenDAO {
    public boolean save(Token token);

    public boolean update(Token token);

    public boolean delete(Token token);

    public Token getToken(Long id);

    public Token getToken(String query);

    public List<Token> findAllToken();

    public List<Token> findAllToken(String query);
}