package service;

import com.example.demo.model.User;
import com.example.demo.web.dto.UserRegistractionDto;

public interface UserService {
	User save(UserRegistractionDto registrationDto);

}
