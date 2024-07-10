package com.example.cruddemo.entity

import jakarta.persistence.*

@Entity
@Table(name = "employee")
class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private var id: Long = 0

    @Column(name = "first_name")
    private var firstName: String = ""

    @Column(name = "last_name")
    private var lastName: String = ""

    @Column(name = "email")
    private var email: String = ""

    constructor() {

    }

    constructor(firstName: String, lastName: String, email: String) {
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
    }

    fun getId() = id
    fun getFirstName() = firstName
    fun getLastName() = lastName
    fun getEmail() = email
}