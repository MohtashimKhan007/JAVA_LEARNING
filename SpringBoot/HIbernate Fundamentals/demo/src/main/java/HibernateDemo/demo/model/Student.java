package HibernateDemo.demo.model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Student_table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Student_name",
            nullable = false,
            length = 100
    )
    private String name;
    @Column(unique = true,
            nullable = false,
            length = 150)
    private String email;
    private int age;

    // we cannot store the set of string inside the column
    //we have to tell the database that create the table for the skills
    // and us table me student id ko as a foreign key use kro

//    @ElementCollection
//    @CollectionTable(name = "student_skills",
//            joinColumns = @JoinColumn(name = "student_id")
//    )
//    private Set<String> skills;


    //storing the addresses

    @ElementCollection
    @CollectionTable(name = "student_address",
                      joinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Address> addresses;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="houseNo",column = @Column(name = "current_house_no")),
//            @AttributeOverride(name="street",column = @Column(name = "current_street_no")),
//            @AttributeOverride(name="city",column = @Column(name = "current_city")),
//            @AttributeOverride(name="state",column = @Column(name="current_state")),
//            @AttributeOverride(name="pincode",column = @Column(name="current_pincode"))
//
//    })
//    private Address currentaddress;
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "houseNo", column = @Column(name = "permanent_house_no")),
//            @AttributeOverride(name = "street", column = @Column(name = "permanent_street")),
//            @AttributeOverride(name = "city", column = @Column(name = "permanent_city")),
//            @AttributeOverride(name = "state", column = @Column(name = "permanent_state")),
//            @AttributeOverride(name = "pincode", column = @Column(name = "permanent_pincode"))
//    })
//    private Address permanentAddress;
//    @Column(precision = 5,scale = 2)
//    private BigDecimal percentage;
//
//    private LocalDate dateOfBirth;
//    private LocalDateTime createdAt;
//    @Enumerated(EnumType.STRING)
//    private StudentStatus status;
//    @Lob
//    private String profileDescription;
//    @Convert(converter = BooleanToStringConverter.class)
//    private boolean isMonitor;
//

    /// /    if i want ki ye displayName participate na kre  columns ke form hone ke liye
//    @Transient
//    private String displayName;
    public Student() {
    }

    public Student(Long id, String name, String email, int age, Set<Address> addresses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.addresses = addresses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
}


