package mysqlazure.electronics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElectronicsApplication {
	@Autowired
	private ElectronicsRepository repository;
	
	@PostMapping("/product")
	public Electronics addElectronic(@RequestBody Electronics electronics) {
		return repository.save(electronics);
		
	}
	@GetMapping("products")
	public List<Electronics>getElectronics(){
		return repository.findAll();
	}
	
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(ElectronicsApplication.class, args);
	}

}
