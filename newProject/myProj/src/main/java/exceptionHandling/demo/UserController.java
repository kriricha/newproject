package exceptionHandling.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServiceinf service;
//	private UserService service;

	@PostMapping("/signup")
	public User saveUser(@RequestBody @Valid User userRequest) {
		return service.saveuser(userRequest);
	}

	@GetMapping("/fetch")
	public ResponseEntity<List<User>> getAllUser() {
		return ResponseEntity.ok(service.getAlluser());

	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id) throws UserNotFoundException {
		return ResponseEntity.ok(service.getuser(id));

	}

	@PutMapping("/{id}")
	public ResponseEntity<User> updateData(@PathVariable int id, @RequestBody @Valid User userRequest) {
		return ResponseEntity.ok(service.updateData(id, userRequest));
	}
	@DeleteMapping("/{id}")
	public String DeleteData(@PathVariable int id) {
		service.deleteData(id);
		return "data deleted";
		
	}
	@DeleteMapping("/users")
	public String DeleteAllData() {
		service.deleteAllData();
		return "All data deleted";
		
	}
}
