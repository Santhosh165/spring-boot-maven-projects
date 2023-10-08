package productAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restapi {
	@RequestMapping("/hi")
	public String api() {
		return "HI";
		
	}

}
