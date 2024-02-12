package exceptionHandling.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface applicationRepository extends JpaRepository<User, Integer> {

//	User findUserById(int id);

//	 User findByIdd(int id);

//	abstract User save(@Valid UserRequest userRequest);

}
