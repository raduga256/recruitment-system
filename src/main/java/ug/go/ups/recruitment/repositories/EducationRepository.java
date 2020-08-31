package ug.go.ups.recruitment.repositories;

import org.springframework.data.repository.CrudRepository;
import ug.go.ups.recruitment.domain.Education;

import java.util.Optional;

public interface EducationRepository extends CrudRepository<Education, Long> {

    Optional<Education> findByName(String name);
}
