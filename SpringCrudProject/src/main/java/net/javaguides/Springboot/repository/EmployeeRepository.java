package net.javaguides.Springboot.repository;

import net.javaguides.Springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("select u from Employee u where u.leadId = ?1")
    Employee findbyLeadId(String leadId);

    @Query(value = "select * from Employee u where u.mobileNumber = :mobileNumber", nativeQuery = true)
    Employee findbyMobileNumber(String mobileNumber);







}
