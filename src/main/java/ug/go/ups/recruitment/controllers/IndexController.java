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
import ug.go.ups.recruitment.services.ApplicantService;

import java.util.Optional;

@Controller
public class IndexController {

    private final ApplicantService applicantService;

    public IndexController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

       model.addAttribute("applicants", applicantService.getApplicants());

        return "index";
    }
}
