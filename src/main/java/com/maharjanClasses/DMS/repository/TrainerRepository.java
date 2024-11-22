package com.maharjanClasses.DMS.repository;

/**
 * @author Enid Maharjan
*/


import org.springframework.data.repository.CrudRepository;

import com.maharjanClasses.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
