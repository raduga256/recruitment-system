package ug.go.ups.recruitment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ug.go.ups.recruitment.domain.Applicant;
import ug.go.ups.recruitment.domain.District;
import ug.go.ups.recruitment.domain.Education;
import ug.go.ups.recruitment.repositories.ApplicantRepository;
import ug.go.ups.recruitment.repositories.DistrictRepository;
import ug.go.ups.recruitment.repositories.EducationRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private final ApplicantRepository applicantRepository;
    private final DistrictRepository districtRepository;
    private final EducationRepository educationRepository;

    public IndexController(ApplicantRepository applicantRepository, DistrictRepository districtRepository, EducationRepository educationRepository) {
        this.applicantRepository = applicantRepository;
        this.districtRepository = districtRepository;
        this.educationRepository = educationRepository;
    }



    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        Optional<Applicant> applicantOptional = applicantRepository.findByFirstName("PETERO");
        Optional<Education> educationOptional = educationRepository.findByName("O-Level");
        Optional<District> districtOptional = districtRepository.findByName("Kampala");

        System.out.println("Applicant ID - "+applicantOptional.get().getId() + " Last Name - "+applicantOptional.get().getLastName());
        System.out.println("Education Level - "+educationOptional.get().getId());
        System.out.println("District Name - "+districtOptional.get());

        return "index";
    }
}
