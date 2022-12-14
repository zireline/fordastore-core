package com.splitscale.fordastore.core.repositories;

import com.splitscale.fordastore.core.user.User;
import com.splitscale.fordastore.core.user.UserRequest;

public interface UserRepository {

  public User findByUID(String uid) throws Exception;

  public User findByUsername(String username) throws Exception;

  public User add(UserRequest userRequest) throws Exception;

  public boolean update(Long id, UserRequest userRequest) throws Exception;
}
