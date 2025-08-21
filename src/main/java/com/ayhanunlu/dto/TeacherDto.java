package com.ayhanunlu.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class TeacherDto {

    private Long teacherId;

    @NotEmpty(message = "Leaving Name and Surname field empty is not possible")
    @Size(min = 1, max = 255)
    private String teacherNameSurname;

    @NotEmpty(message = "Email field has to be filled")
    @Email(message = "Please Use proper format for email")
    private String teacherEmail;

    @NotEmpty(message = "Password field has to be filled")
    @Size(min=3,max=18)
/*
    Could be used for age verification not for password
    @Min(value = 18, message = "Teacher age should be above 18")
    @Max(value = 64, message = "Teachers get retired at the age of 65")
*/
    private String teacherPassword;
}
