package ug.go.ups.recruitment.repositories;

import org.springframework.data.repository.CrudRepository;
import ug.go.ups.recruitment.domain.Education;

public interface EducationRepository extends CrudRepository<Education, Long> {
}
