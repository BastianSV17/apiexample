package com.exampleapi.crud.user;

import com.exampleapi.crud.repositories.IUserRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	IUserRepository userRepository;

	public ArrayList<UserModel> getUsers() {
		return (ArrayList<UserModel>) userRepository.findAll();
	}
}
