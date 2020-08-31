package ug.go.ups.recruitment.repositories;

import org.springframework.data.repository.CrudRepository;
import ug.go.ups.recruitment.domain.Applicant;
import ug.go.ups.recruitment.domain.RecruitmentCenter;

import java.util.Optional;

public interface ApplicantRepository extends CrudRepository<Applicant, Long> {

    Optional<Applicant> findByFirstName(String name);
}
