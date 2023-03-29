package com.example.spring.mappers;

import com.example.spring.dto.UserDTO;
import com.example.spring.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    @Mapping(source = "id", target = "userId")
    UserDTO userToUserDTO(User user);

}
