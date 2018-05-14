package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Employee.findSurname",
        query = "FROM Employee WHERE lastName > :LASTNAME"
)
@Entity
@Table(name = "employees")
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private List<Company> companies = new ArrayList<>();

    public Employee(){}

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "join_company_employee",
            joinColumns = {@JoinColumn(name = "employee_id", referencedColumnName = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "company_id", referencedColumnName = "company_id")})

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "employee_id", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "firstname")
    public String getFirstName() {
        return firstName;
    }

    @NotNull
    @Column(name = "lastname")
    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
