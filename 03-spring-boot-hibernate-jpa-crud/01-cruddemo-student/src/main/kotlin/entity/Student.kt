package entity

import jakarta.persistence.*

@Entity
@Table(name = "student")
class Student(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id") var id: Int,
    @Column(name = "first_name") var firstName: String,
    @Column(name = "last_name") var lastName: String,
    @Column(name = "email") var email: String,
) {
    override fun toString(): String {
        return "Student(id=$id, firstName='$firstName', lastName='$lastName', email='$email')"
    }
}