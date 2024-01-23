package pl.touljaboy.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Connect class to existing database
@Entity
@Table(name="student")
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private int id;
    @Column(name="first_name")
    @Getter
    @Setter
    private String firstName;
    @Column(name="last_name")
    @Getter
    @Setter
    private String lastName;
    @Column(name="email")
    @Getter
    @Setter
    private String email;

    public Student() {
    }
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
