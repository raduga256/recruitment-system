package ug.go.ups.recruitment.services;

import org.springframework.stereotype.Service;
import ug.go.ups.recruitment.domain.Applicant;
import ug.go.ups.recruitment.repositories.ApplicantRepository;

import java.util.HashSet;
import java.util.Set;
@Service
public class ApplicantServiceImpl implements ApplicantService {

    private final ApplicantRepository applicantRepository;

    public ApplicantServiceImpl(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @Override
    public Set<Applicant> getApplicants() {

        Set<Applicant> applicantSet = new HashSet<>();

        applicantRepository.findAll().iterator().forEachRemaining(applicantSet::add);

        return applicantSet;
    }
}
