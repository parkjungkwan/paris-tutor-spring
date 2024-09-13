package com.joeunseo.hotel.service;

import com.joeunseo.hotel.model.domain.UserModel;

public interface UserService {

    Boolean authSuccess(Long id);

    Boolean authenticateUser(UserModel user);

    UserModel getById(Long id);

    Boolean authFail(Long id);

    Boolean logout(Long id);

    Boolean register(UserModel user);

    Boolean update(UserModel user);

    UserModel getList(UserModel user);

    Boolean delete(Long id);

    Boolean updateRole(Long userId, Long role);
}
