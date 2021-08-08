package com.example.demoproject

class Validation {

    fun isUserNamePassword(userName:String, password: String):Boolean
    {
        if (userName.isNotEmpty() && password.isNotEmpty())
            return true
        return false
    }
    fun isUserName(userName:String):Boolean
    {
        if (userName.isNotEmpty())
        return true
        return false
    }
    fun isPassword(password:String):Boolean
    {
        if (password.isNotEmpty())
            return true
        return false
    }
}