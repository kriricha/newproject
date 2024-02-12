package exceptionHandling.demo;

import java.util.List;

import jakarta.validation.Valid;


public interface UserServiceinf {

	User saveuser(@Valid User userRequest);

	List<User> getAlluser();

	User getuser(int id) throws UserNotFoundException;

	User updateData(int id, @Valid User userRequest);

	void deleteData(int id);

	void deleteAllData();

}
