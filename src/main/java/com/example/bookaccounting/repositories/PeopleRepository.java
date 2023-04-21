package com.example.bookaccounting.repositories;

import com.example.bookaccounting.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
//    Optional<Person> findByName(String name);
}
