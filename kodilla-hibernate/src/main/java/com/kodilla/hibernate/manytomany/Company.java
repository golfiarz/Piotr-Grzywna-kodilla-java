package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.serchCompany",
        query = "SELECT * FROM COMPANY WHERE NAME LIKE 'sof%' ",
        resultClass = Company.class
)
@Entity
@Table(name = "campanies")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company(){}

    public Company(String name){
        this.name=name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "company_id", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "company_name")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
