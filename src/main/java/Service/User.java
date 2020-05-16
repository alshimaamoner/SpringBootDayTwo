package Service;
// Generated May 10, 2020, 10:00:05 PM by Hibernate Tools 4.3.1


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * User generated by hbm2java
 */
@Entity
public class User implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
     private String name;
     private String pass;
    private String firstName;
     private String lastName;

    public User() {
    }

	
    public User(String name, String pass, String lastName) {
        this.name = name;
        this.pass = pass;
        this.lastName = lastName;
    }
    public User(String name, String pass, String firstName, String lastName) {
       this.name = name;
       this.pass = pass;
       this.firstName = firstName;
       this.lastName = lastName;
    }

    @Id
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}


