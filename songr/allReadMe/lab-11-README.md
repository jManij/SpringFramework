Lab 11: Spring for Full-Stack Web Apps
#Problem Domain
- There are 3 routes: "/hello", "capitalize/param", "/reversesentence=param".
- "/hello" renders the page to say "Hello World!"
- "/capitalize/param" takes in a param and capitalizes that when loaded. 
- "/reversesentence=param" takes in a param and reverses that when loaded.


#How to run it
- Clone the repo: https://github.com/jManij/java-fundamentals

Testing from terminal:
   - cd to songr
   - run the following command: './gradlew test'
   - All the tests should pass.
   
Testing from IJ:
  - Via import project, choose "songr"
  - run the following command: './gradlew test'
  - All the tests should pass.
  
Running from browser:
- cd to songr and run the application
- Go to browser and type "localhost:8080/hello"
- The page should display "Hello World!"
- Now type "localhost:8080/capitalize/hello"
- The page should display "HELLO"
- Finally, type "localhost:8080/reversesentence=hello world"
- The page should display "dlrow olleh"
