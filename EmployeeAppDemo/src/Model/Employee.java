package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
    private String emp_no;
    private String birthDate;
    private String firstname;
    private String lastname;
    private String gender;
    private String hire_date;

    public Employee(ResultSet resultSet) throws SQLException {
        this.emp_no = resultSet.getString("emp_no");
        this.birthDate = resultSet.getString("birth_date");
        this.firstname = resultSet.getString("first_name");
        this.lastname = resultSet.getString("last_name");
        this.gender = resultSet.getString("gender");
        this.hire_date = resultSet.getString("hire_date");
    }

    public String getEmpno() {
        return emp_no;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getHire_date() {
        return hire_date;
    }
}
