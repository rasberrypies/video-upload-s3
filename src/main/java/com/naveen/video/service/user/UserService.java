package com.naveen.video.service.user;

import com.naveen.video.domain.UserCreateForm;
import com.naveen.video.domain.User;

import java.util.Collection;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
