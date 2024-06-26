package com.example.cruddemo.entity

import jakarta.persistence.*
import kotlin.properties.Delegates

@Entity
@Table(name = "student")
class Student() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 0

    @Column(name = "first_name") lateinit var firstName: String
    @Column(name = "last_name") lateinit var lastName: String
    @Column(name = "email") lateinit var email: String

    constructor(firstName: String, lastName: String, email: String) : this() {
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
    }

    override fun toString(): String {
        return "Student(id=$id, firstName='$firstName', lastName='$lastName', email='$email')"
    }
}