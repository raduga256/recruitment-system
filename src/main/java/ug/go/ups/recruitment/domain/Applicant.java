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
    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String telNo;

    private LocalDate birthDate;


    @ManyToOne
    private District dob;

    @ManyToOne
    private RecruitmentCenter center;

    @OneToOne
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

    public Applicant(String nin, String firstName, String lastName, int age, Gender gender, String telNo, LocalDate birthDate, District dob, RecruitmentCenter center, Education educationLevel, Set<InterviewResults> interviewResults, SpecialAttribute specialAttribute, SpecialAttNotes specialAttNotes, Set<RecruitmentStage> recruitmentStage, Byte[] image) {
        this.nin = nin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.telNo = telNo;
        this.birthDate = birthDate;
        this.dob = dob;
        this.center = center;
        this.educationLevel = educationLevel;
        this.interviewResults = interviewResults;
        this.specialAttribute = specialAttribute;
        this.specialAttNotes = specialAttNotes;
        this.recruitmentStage = recruitmentStage;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public District getDob() {
        return dob;
    }

    public void setDob(District dob) {
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

    public Set<InterviewResults> getInterviewResults() {
        return interviewResults;
    }

    public void setInterviewResults(Set<InterviewResults> interviewResults) {
        this.interviewResults = interviewResults;
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
        return id.equals(applicant.id);
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
