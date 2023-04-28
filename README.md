# User Management System

## Frameworks and Languages used:
* `Java 17`
* `Maven 4.0.0`
* `Spring Boot 3.0.5(Framwork)`
* `IntelliJ IDEA 2023.1 (Community Edition)`


## Data Flow:
 1. ### Model: 
    Created User class along with properties like userId, userName, dateOfBirth, email,phoneNo, date,time and create a constructor, and getters and setters.Using some validation with properties like @Not null ,@Not Empty, @Blank,@Size, @Email, @Pattern.
 1. ### Controller: 
    * Created UserController class in which having annotation like @GetMapping,
    @PostMapping,@PutMapping,@DeleteMapping.Created a object of UserService class through dependency injection using @Autowired annotation.

    #### API Reference:
    * Get all users:

      ```http://localhost:8080/getAllUser```

    * Get User By Id:

      ```http://localhost:8080/getUser/{id}```  

    * Add User:

      ```http://localhost:8080/addUser```

    * Delete User By Id:

      ```http://localhost:8080/deleteUser/{id}```

    * Update User By id:

      ```http://localhost:8080/updateUserInfo/{id}/{email}/{phoneNo}```




 1. ### Service: 
    * It consist UserService class in which having some buisness logic.
    * @Service annotation is used to make the class as a service layer.

 1. ### Repository:
    * Created UserDao class in which used ArrayList to manage the data of users by performing CRUD operations.



## Data Structure
Used ArrayList to store the User type object.

## Project Summary
In this spring boot application I had created API's mapping for CRUD operations like create(save), read(get), update and delete User. Aim of these project to using some validation like @Not null ,@Not Empty, @Blank @Pattern, @Email, @Size  in User Management System .