package com.comp313.knockknockapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.comp313.knockknockapi.domain.TechDetails;

public interface TechDetailsRepo extends CrudRepository<TechDetails, Long>{

}
