package ug.go.ups.recruitment.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ug.go.ups.recruitment.domain.Applicant;
import ug.go.ups.recruitment.domain.District;
import ug.go.ups.recruitment.domain.Education;
import ug.go.ups.recruitment.domain.RecruitmentCenter;
import ug.go.ups.recruitment.repositories.ApplicantRepository;
import ug.go.ups.recruitment.repositories.DistrictRepository;
import ug.go.ups.recruitment.repositories.EducationRepository;
import ug.go.ups.recruitment.repositories.RecruitmentCenterRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class ApplicantBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final ApplicantRepository applicantRepository;
    private final DistrictRepository districtRepository;
    private final EducationRepository educationRepository;
    private final RecruitmentCenterRepository centerRepository;

    public ApplicantBootstrap(ApplicantRepository applicantRepository, DistrictRepository districtRepository, EducationRepository educationRepository,
                              RecruitmentCenterRepository centerRepository) {
        this.applicantRepository = applicantRepository;
        this.districtRepository = districtRepository;
        this.educationRepository = educationRepository;
        this.centerRepository = centerRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        applicantRepository.saveAll(getApplicants());
    }

    private List<Applicant> getApplicants(){

        List<Applicant> applicants = new ArrayList<>(2);

        //get Education Level
        Optional<Education> educationOptional = educationRepository.findByName("O-Level");
        if(!educationOptional.isPresent()){
            throw new RuntimeException("Expected Education Level Not Found");
        }

        Optional<Education> noEducationOptional = educationRepository.findByName("No School");
        if (!noEducationOptional.isPresent()){
            throw new RuntimeException("Expected Education Level Not Found");
        }

        //get the education optionals
        Education oLevel = educationOptional.get();
        Education noSchool = noEducationOptional.get();

        //get Districts
        Optional<District> districtOptional = districtRepository.findByName("Kampala");

        if (!districtOptional.isPresent()){
            throw new RuntimeException("Expected District Not Found");
        }

        Optional<District> guluDistrictOptional = districtRepository.findByName("Gulu");

        if (!guluDistrictOptional.isPresent()){
            throw new RuntimeException("Expected District Not Found");
        }

        //get district Optionals
        District kampala = districtOptional.get();
        District gulu = guluDistrictOptional.get();

        //Get Recruitment Centers
        Optional<RecruitmentCenter> centerOptional = centerRepository.findByName("South Western");

        if (!centerOptional.isPresent()){
            throw new RuntimeException("Expected Recruitment Center Not Found");
        }

        //get recruitment Optional into class object
        RecruitmentCenter southWestern = centerOptional.get();

        //Create new applicant Okech
        Applicant oketchApplicant = new Applicant();
        oketchApplicant.setAge(24);
        oketchApplicant.setLastName("Ntalo");
        oketchApplicant.setFirstName("Moses");
        oketchApplicant.setEducationLevel(oLevel);
        oketchApplicant.setDob(kampala);
        oketchApplicant.setCenter(southWestern);

        //Create new applicant Job
        Applicant jobApplicant = new Applicant();
        jobApplicant.setAge(24);
        jobApplicant.setLastName("Owamani");
        jobApplicant.setFirstName("Job");
        jobApplicant.setEducationLevel(oLevel);
        jobApplicant.setDob(gulu);
        jobApplicant.setCenter(southWestern);

        //Adding the two applicants to the List
        applicants.add(oketchApplicant);
        applicants.add(jobApplicant);





        return applicants;
    }


}
