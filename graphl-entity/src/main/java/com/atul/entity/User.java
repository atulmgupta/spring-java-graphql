package com.atul.entity;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@GraphQLName("user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Document
public class User extends AbstractDocument {
    @GraphQLField
    private String firstName;
    @GraphQLField
    private String lastName;
    @GraphQLField
    private String userName;
    @GraphQLField
    private String email;

}
