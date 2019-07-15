package com.atul.services.user;

import com.atul.entity.User;
import com.atul.repository.UserRepository;
import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
@GraphQLName("query")
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @PostConstruct
    public void insertData() {
        for (int i = 0; i < 1000; i++) {
                userRepository.save(new User("demo " + i, "user", "demouser " + i, "demouser " + i + "@gmail.com"));
        }
    }

    @Autowired
    UserRepository userRepository;
    @GraphQLField
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
    @GraphQLField
    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    @GraphQLField
    @Override
    public void deleteUser(ObjectId id) {
        userRepository.deleteById(id);
    }
}
