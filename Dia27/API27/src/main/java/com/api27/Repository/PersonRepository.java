package com.api27.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api27.Model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

}
