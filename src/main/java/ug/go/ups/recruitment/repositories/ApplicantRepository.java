package ug.go.ups.recruitment.repositories;

import org.springframework.data.repository.CrudRepository;
import ug.go.ups.recruitment.domain.Applicant;

public interface ApplicantRepository extends CrudRepository<Applicant, Long> {
}
