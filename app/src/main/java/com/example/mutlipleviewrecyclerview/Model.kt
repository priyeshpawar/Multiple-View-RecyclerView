package com.example.mutlipleviewrecyclerview

class Model {

    val TYPE_IMAGE: Int = 1
    val TYPE_INFORMATION: Int = 2;

    private var imageUrl: String = ""

    constructor(imageUrl: String) {
        this.imageUrl = imageUrl
    }

    constructor(profileUrl: String, name: String, role: String, information: String) {
        this.profileUrl = profileUrl
        this.name = name
        this.role = role
        this.information = information
    }

    private var profileUrl: String = ""
    private var name: String = ""
    private var role = ""
    private var information = ""
}