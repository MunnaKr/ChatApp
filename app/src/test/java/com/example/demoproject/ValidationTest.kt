package com.example.demoproject

import com.example.demoproject.Validation
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ValidationTest
{
    private lateinit var validation: Validation

    val userName:String="krmunna"
    val password:String="123456"
    @Before
    fun setUp()
    {
        validation= Validation()
    }

    @Test
    fun checkUserNamePassword()
    {
        val result = validation.isUserNamePassword(userName, password)
        assertThat(result).isTrue()
    }
    @Test
    fun checkUserName()
    {
        val result = validation.isUserName(userName)
        assertThat(result).isTrue()
    }

    @Test
    fun checkPassword()
    {
        val result = validation.isPassword(password)
        assertThat(result).isTrue()
    }
}
