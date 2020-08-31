package ug.go.ups.recruitment.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Entity
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nin;
    private String firstName;
    private String lastName;
    private Long applicantNo;
    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String telNo;
    private LocalDate dob;

    @ManyToOne
    private RecruitmentCenter center;

    @OneToOne(cascade = CascadeType.ALL)
    private Education educationLevel;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicant")
    private Set<InterviewResults> interviewResults = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    private SpecialAttribute specialAttribute;

    @OneToOne(cascade = CascadeType.ALL)
    private SpecialAttNotes specialAttNotes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicant")
    private Set<RecruitmentStage> recruitmentStage = new HashSet<>();
    @Lob
    private Byte[] image;

    public Applicant(String nin, String firstName, String lastName, Long applicantNo, int age,
                     Gender gender, String telNo, LocalDate dob, RecruitmentCenter center,
                     Education educationLevel, SpecialAttribute specialAttribute,
                     SpecialAttNotes specialAttNotes,  Byte[] image) {
        this.nin = nin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.applicantNo = applicantNo;
        this.age = age;
        this.gender = gender;
        this.telNo = telNo;
        this.dob = dob;
        this.center = center;
        this.educationLevel = educationLevel;
        this.specialAttribute = specialAttribute;
        this.specialAttNotes = specialAttNotes;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getApplicantNo() {
        return applicantNo;
    }

    public void setApplicantNo(Long applicantNo) {
        this.applicantNo = applicantNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public RecruitmentCenter getCenter() {
        return center;
    }

    public void setCenter(RecruitmentCenter center) {
        this.center = center;
    }

    public Education getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(Education educationLevel) {
        this.educationLevel = educationLevel;
    }


    public SpecialAttribute getSpecialAttribute() {
        return specialAttribute;
    }

    public void setSpecialAttribute(SpecialAttribute specialAttribute) {
        this.specialAttribute = specialAttribute;
    }

    public SpecialAttNotes getSpecialAttNotes() {
        return specialAttNotes;
    }

    public void setSpecialAttNotes(SpecialAttNotes specialAttNotes) {
        this.specialAttNotes = specialAttNotes;
    }

    public Set<RecruitmentStage> getRecruitmentStage() {
        return recruitmentStage;
    }

    public void setRecruitmentStage(Set<RecruitmentStage> recruitmentStage) {
        this.recruitmentStage = recruitmentStage;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applicant applicant = (Applicant) o;
        return id.equals(applicant.id) &&
                Objects.equals(specialAttribute, applicant.specialAttribute) &&
                Objects.equals(specialAttNotes, applicant.specialAttNotes) &&
                Objects.equals(recruitmentStage, applicant.recruitmentStage) &&
                Arrays.equals(image, applicant.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", nin='" + nin + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", applicantNo=" + applicantNo +
                ", age=" + age +
                ", gender=" + gender +
                ", telNo='" + telNo + '\'' +
                ", dob=" + dob +
                ", center=" + center +
                ", educationLevel=" + educationLevel +
                ", interviewResults=" + interviewResults +
                ", specialAttribute=" + specialAttribute +
                ", specialAttNotes=" + specialAttNotes +
                ", recruitmentStage=" + recruitmentStage +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
