package com.geekster.userManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotBlank
    private String userId;

    @NotNull
    private String userName;

    @Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$")
    private String dateOfBirth;

    @Email
    @Pattern(regexp = "^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$")
    private String email;

    @Size(min = 12,max = 14)
    @Pattern(regexp = "^[+]{1}(?:[0-9\\-\\(\\)\\/\\.]\\s?){6,15}[0-9]{1}$")
    private String phoneNo;

    @Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$")
    private String date;

    @NotEmpty
    private String time;

}
