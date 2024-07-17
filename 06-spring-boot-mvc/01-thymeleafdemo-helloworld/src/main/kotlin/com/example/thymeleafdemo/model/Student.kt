package com.example.thymeleafdemo.model

class Student {
    var firstName: String = ""
        private set
    var lastName: String = ""
        private set
    var country: String = ""
        private set
    var favoriteLanguage = ""
        private set
    var favoriteSystems = listOf<String>()
        private set

    constructor() {

    }

    constructor(firstName: String, lastName: String, country: String, favoriteLanguage: String, favoriteSystems: List<String>) {
        this.firstName = firstName
        this.lastName = lastName
        this.country = country
        this.favoriteLanguage = favoriteLanguage
        this.favoriteSystems = favoriteSystems
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    fun setCountry(country: String) {
        this.country = country
    }

    fun setFavoriteLanguage(favoriteLanguage: String) {
        this.favoriteLanguage = favoriteLanguage
    }

    fun setFavoriteSystems(favoriteSystems: List<String>) {
        this.favoriteSystems = favoriteSystems
    }
}