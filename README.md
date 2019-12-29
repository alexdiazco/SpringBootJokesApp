# SpringBootJokesApp

This Spring Boot web application display random Chuck norris jokes on the index.


1. Create Spring Boot Project From Spring Initializr
  1.1. Only Select 'Web' and 'Thymeleaf' dependencies
2. Add Dependency : group : guru.springframework, name: 'chuck-norris-for-actuator', version : '0.0.2'
    - https://mvnrepository.com/artifact/guru.springframework/chuck-norris-for-actuator/0.0.2
3. Create Service to return joke string from class guru.springframework.norris.chuck.ChuckNorrisQuotes.getRandomQuote()
4. Create MVC Jokes controller
5. Map context root ("/","") to jokes view
6. Add Joke text to joke property of Model
7. Return view name of chucknorris
8. Create Thymeleaf view for chucknorris
