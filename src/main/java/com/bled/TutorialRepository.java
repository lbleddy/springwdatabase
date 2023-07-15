package com.bled;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends CrudRepository<Tutorial,Long> {
    List<Tutorial> findByName(String name);

    Tutorial findById(long id);
}
