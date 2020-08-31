package ug.go.ups.recruitment.repositories;

import org.springframework.data.repository.CrudRepository;
import ug.go.ups.recruitment.domain.RecruitmentCenter;

import java.util.Optional;

public interface RecruitmentCenterRepository extends CrudRepository<RecruitmentCenter, Long> {


    Optional<RecruitmentCenter> findByName(String name);
}
