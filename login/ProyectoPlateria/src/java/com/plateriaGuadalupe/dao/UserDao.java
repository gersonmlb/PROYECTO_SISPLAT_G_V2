
package com.plateriaGuadalupe.dao;

import com.plateriaGuadalupe.entity.User;
import java.util.HashMap;
import java.util.List;

public interface UserDao{
    
    int create (User u);
    int update(User u);
    List<User> ReadAll();
    User read(int key);
    int delete(String key);
    HashMap<String,Object> validar(String x, String y, String z);
    User Remember(String email);
    User validar2(String x, String y, String z);
    User NroUser();
}
