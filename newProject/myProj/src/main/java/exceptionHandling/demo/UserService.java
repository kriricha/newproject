package exceptionHandling.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.validation.Valid;

@Service
public class UserService implements UserServiceinf {
	@Autowired
	private applicationRepository repository;

//	public List<User> getAlluser() {
//
//		return repository.findAll();
//	}

	public User getuser(int id) throws UserNotFoundException {

		User user = repository.findById(id).get();
//		return repository.findById(id).get();
		if (user != null) {
			return user;
		} else {
			throw new UserNotFoundException("user not found with id:" + id);
		}

	}

	public User saveuser(@Valid User userRequest) {

		return repository.save(userRequest);
	}

	public User updateData(int id, User userRequest) {

		User data = repository.findById(id).get();

		if (data != null) {
			data.setName(userRequest.getName());
			data.setAge(userRequest.getAge());
			data.setEmail(userRequest.getEmail());
			data.setGender(userRequest.getGender());
			data.setMobile(userRequest.getMobile());
			data.setNationality(userRequest.getNationality());
		}

		return repository.save(data);
	}

	public void deleteData(int id) {
		repository.deleteById(id);

	}

	public void deleteAllData() {
		repository.deleteAll();

	}

	@Override
	public List<User> getAlluser() {
		
		return repository.findAll();
	}

}
