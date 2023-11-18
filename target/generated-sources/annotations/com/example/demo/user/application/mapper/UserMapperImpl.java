package com.example.demo.user.application.mapper;

import com.example.demo.user.domain.User;
import com.example.demo.user.infrastructure.repository.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-18T12:14:23-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.12 (Microsoft)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapToDomain(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( userEntity.getId() );
        user.name( userEntity.getName() );
        user.lastName( userEntity.getLastName() );
        user.photoUrl( userEntity.getPhotoUrl() );
        user.type( userEntity.getType() );

        return user.build();
    }

    @Override
    public UserEntity mapToEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( user.getId() );
        userEntity.setName( user.getName() );
        userEntity.setLastName( user.getLastName() );
        userEntity.setPhotoUrl( user.getPhotoUrl() );
        userEntity.setType( user.getType() );

        return userEntity;
    }
}
