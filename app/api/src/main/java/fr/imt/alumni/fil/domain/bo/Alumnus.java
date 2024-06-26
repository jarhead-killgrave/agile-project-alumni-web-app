package fr.imt.alumni.fil.domain.bo;

import fr.imt.alumni.fil.domain.enums.Sex;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Alumni")
public class Alumnus {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "sex")
    private Sex sex;

    @Column(name = "mail")
    private String mail;

    @Column(name = "coop_company")
    private String coopCompany;

    @Column(name = "current_company")
    private String currentCompany;

    @Column(name = "website")
    private String website;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "is_stayed")
    private Boolean isStayed;

    @Column(name = "graduation_year")
    private String graduationYear;

    public Alumnus(UUID id, String firstName, String lastName, Sex sex, String mail,
                   String coopCompany, String currentCompany, String website,
                   String country, String city, Boolean isStayed, String graduationYear) {
        this.id = id;
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.sex = sex;
        this.mail = mail.trim();
        this.coopCompany = coopCompany.trim();
        this.currentCompany = currentCompany.trim();
        this.website = website.trim();
        this.country = country.trim();
        this.city = city.trim();
        this.isStayed = isStayed;
        this.graduationYear = graduationYear.trim();
    }

    protected Alumnus() {
    }

    public UUID getId() {
        return id;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCoopCompany() {
        return coopCompany;
    }

    public void setCoopCompany(String coop_company) {
        this.coopCompany = coop_company;
    }

    public String getCurrentCompany() {
        return currentCompany;
    }

    public void setCurrentCompany(String current_company) {
        this.currentCompany = current_company;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getIsStayed() {
        return isStayed;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public void setIsStayed(Boolean is_stayed) {
        this.isStayed = is_stayed;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
