package net.javaguides.Springboot.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employeessss")
public class Employee{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @NotNull
    @Column(name = "leadId")
    private String leadId;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "middle_name")
    private String middlename;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "email")
    private String emailId;
    @Column(name = "mobileNumber")
    private String Mobile;

    @Column(name = "gender")
    private String gender;

    @Column(name = "dob")
    private LocalDateTime Dob;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getDob() {
        return Dob;
    }

    public void setDob(LocalDateTime dob) {
        Dob = dob;
    }




    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
