So first of all i started creating this project by adding some dependencies such as Spring web, Spring Data JPA,My SQL connector, Spring Dev Tool, Lombok.
After the succesfully creation of the project my second step was to add database configuration in appication.properties file.
And then after that i create some classes and interfaces like User class, UserRepo Interface, UserService interface ,UserServiceImpl class,and a UserController class to control the RestAPI.

**Instructions on how to run the application**
First you have to create a database name "intern" in MySQL database and your database's url must be localhost:3306 (as i mentioned in my database configuration file in application.properties).
Second you have to install Postman to run the RestAPI in your system.
Third just run the appilication in any Eclipse IDE ,default port number on which appilication will run is 8080.
Fourth open Postman and type http://localhost:8080/api/user/register to add a user and should provide data is this format { "username":"Shavez","email":"shavez@gmail.com","paswword":"1234" }

