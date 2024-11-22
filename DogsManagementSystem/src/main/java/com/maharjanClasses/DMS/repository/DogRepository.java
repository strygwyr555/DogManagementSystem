package com.maharjanClasses.DMS.repository;

/**
 * @author Enid Maharjan
*/


import java.util.List;/**

*/

import org.springframework.data.repository.CrudRepository;

import com.maharjanClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer > {
	List<Dog> findByName(String name);
}
