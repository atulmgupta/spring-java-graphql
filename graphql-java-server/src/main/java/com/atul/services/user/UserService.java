package com.atul.services.user;

import com.atul.entity.User;
import org.bson.types.ObjectId;

public interface UserService {

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(ObjectId id);
}
