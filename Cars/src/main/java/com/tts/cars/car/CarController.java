package com.tts.cars.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

	@Autowired
	private CarRepository carRepository;

	@GetMapping(value = "/")
	public String index() {
		// Where we want to go when our application is started
		return "car/index";
	}

//	@GetMapping(value = "/cars")
//	public String cars() {
//		return "car/cars";
//	}
	
	//TESTING
	@RequestMapping("/car/{id}")
	public String car(@PathVariable Long id, Model model) {
		model.addAttribute("car", carRepository.findById(id));
	return "car/car";
	}

	
	@GetMapping(value = "/cars")
	public String cars(Car car, Model model) {
		Iterable <Car> allCars = carRepository.findAll();
		model.addAttribute("allCars", allCars);
		return "car/cars";
	}

	@GetMapping(value = "/addcar")
	public String addCar(Car car) {
		return "car/addcar";
	}

	private Car car;

	@PostMapping(value = "/addcar")
	public String addNewCar(Car car, Model model) {
		carRepository.save(new Car(car.getMake(), car.getModel(), 
				car.getYear(), car.getDescription(), car.getPhotoURL(), car.getCreated()));
		model.addAttribute("make", car.getMake());
		model.addAttribute("model", car.getModel());
		model.addAttribute("year", car.getYear());
		model.addAttribute("description", car.getDescription());
		model.addAttribute("photoURL", car.getPhotoURL());
		return "car/carresult";
	}

}