package guru.springframework.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping(value = "/dupa")
	public String method() {
		return "siema dupa";
	}

}
