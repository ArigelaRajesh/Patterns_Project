package com.springBootProject.DMS.Repository;
import java.util.List;
/*
 * @author S564145 RajeshArigela
 */
import org.springframework.data.repository.CrudRepository;
import com.springBootProject.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog> findByName(String name);
}