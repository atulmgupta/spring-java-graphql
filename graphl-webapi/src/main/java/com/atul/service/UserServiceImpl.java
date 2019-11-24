package com.atul.service;

import com.atul.entity.User;
import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@GraphQLName("query")
@Slf4j
@Service
public class UserServiceImpl implements UserService {

//    @PostConstruct
//    public void insertData() {
//        for (int i = 0; i < 1000; i++) {
//            userRepository.save(new User("demo " + i, "user", "demouser " + i, "demouser " + i + "@gmail.com"));
//        }
//    }


    @GraphQLField
    @Override
    public User createUser(User user) {
        return null;
    }

    @GraphQLField
    @Override
    public User updateUser(User user) {
        return null;
    }

    @GraphQLField
    @Override
    public void deleteUser(ObjectId id) {

    }
}
