package restapiapp;


import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseapiapp {
	@PostMapping("/product")
	public String saveproduct(@RequestBody courseapi ca) {
		System.out.print(ca);
		return "Product Saved";
	}
	@GetMapping("/product/{caid}")
	public courseapi getproduct(@PathVariable Integer caid) {
		courseapi ca=null;
		if(caid==100) {
			ca = new courseapi(100,"mouse",500.00); 
		}
		else if(caid==101) {
			ca = new courseapi(101,"hd",1500.00);
			
		}
		return ca;
	}
	@GetMapping("/product")
	public List<courseapi> getcourse()
	{
		courseapi ca1 = new courseapi(100,"mouse",500.00);
		courseapi ca2 = new courseapi(101,"hd",1500.00);
		List<courseapi> courses = Arrays.asList(ca1,ca2);
		return courses;
	}
}
