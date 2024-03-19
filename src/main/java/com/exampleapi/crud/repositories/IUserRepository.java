package com.exampleapi.crud.repositories;

import com.exampleapi.crud.user.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, String> {

}
