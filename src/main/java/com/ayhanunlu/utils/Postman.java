package com.ayhanunlu.utils;

import org.springframework.web.bind.annotation.DeleteMapping;

public class Postman {

/*
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    LIST
    GET --> http://localhost:8080/api/v1/employees
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/*
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    FIND
    GET --> http://localhost:8080/api/v1/employees/7
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/*
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    DELETE
    DELETE --> http://localhost:8080/api/v1/employees/7
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/*
    SAVE
    POST --> http://localhost:8080/api/v1/employees
    body --> raw --> JSON
    {
    "firstName":"Ayhan7",
        "lastName":"Unlu7",
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        "emailId":"ayhan-unlu7@hotmail.com"
    }
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

/*
    UPDATE
    PUT --> http://localhost:8080/api/v1/employees/7
    body --> raw --> JSON
    {
        "firstName":"Ayhan8",
            "lastName":"Unlu8",
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            "emailId":"ayhan-unlu8@hotmail.com"
    }
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

}