//package com.atul.services.user;
//
//import com.atul.entity.User;
//import com.atul.repository.UserRepository;
//import graphql.annotations.annotationTypes.GraphQLName;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@GraphQLName("query")
//public class UserQuery {
//
//    @Autowired
//    UserRepository userRepository;
//
//    public User getUser(ObjectId id){
//        return userRepository.findById(id).get();
//    }
//}
