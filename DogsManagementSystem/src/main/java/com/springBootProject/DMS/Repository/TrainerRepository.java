package com.springBootProject.DMS.Repository;
/*
 * @author S564145 RajeshArigela
 */
import org.springframework.data.repository.CrudRepository;
import com.springBootProject.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
	
}
