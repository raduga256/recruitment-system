package ug.go.ups.recruitment.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ug.go.ups.recruitment.domain.Applicant;
import ug.go.ups.recruitment.repositories.ApplicantRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ApplicantServiceImplTest {

    ApplicantServiceImpl applicantService;

    @Mock
    ApplicantRepository applicantRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        applicantService = new ApplicantServiceImpl(applicantRepository);
    }

    @Test
    void getApplicantsTest() {

        Applicant applicant = new Applicant();
        HashSet applicantsData = new HashSet();
        applicantsData.add(applicant);

        when(applicantService.getApplicants()).thenReturn(applicantsData);

        Set<Applicant> applicants = applicantService.getApplicants();

        assertEquals(applicants.size(), 1);
        verify(applicantRepository, times(1)).findAll();
        verify(applicantRepository, never()).findById(anyLong());

    }
}