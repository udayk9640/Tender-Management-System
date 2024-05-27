package controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Login")
public class AuthenticationController 
{
	@GetMapping("{userid}")
	public Login getlogindetails(String userid)
	{
		return new Login("R1234","pass");
		
	}
	

}