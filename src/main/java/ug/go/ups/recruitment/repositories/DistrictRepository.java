package ug.go.ups.recruitment.repositories;

import org.springframework.data.repository.CrudRepository;
import ug.go.ups.recruitment.domain.District;

import java.util.Optional;

public interface DistrictRepository extends CrudRepository<District, Long> {


    Optional<District> findByName(String name);
}
