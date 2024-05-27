package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.User;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

//    @Autowired
//    private AuthenticationService authenticationService;

//    @PostMapping("/login")
//    public ResponseEntity<?> login(@ModelAttribute User user) {
//       System.out.println("success");
//       
//    }
    @GetMapping("/login")
    public String hello() {
       System.out.println("success");
       return "Hello";
    }
  
//    @PostMapping("/register")
//    public ResponseEntity<?> register(@RequestBody RegistrationRequest registrationRequest) {
//        // Implement registration logic
//        // Return ResponseEntity with appropriate status code and response body
//    }

    //@//PostMapping("/logout")
   // public ResponseEntity<?> logout() {
        // Implement logout logic
        // Return ResponseEntity with appropriate status code and response body
    }
//}

