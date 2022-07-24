package com.deloitte.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.deloitte.spring.entity.Vehicle;
import com.deloitte.spring.service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	VehicleService service;

	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}

	@GetMapping("/addVehicle")
	public String showAddVehiclePage(Model model) {
		String view = "addVehiclePage";
		model.addAttribute("vehicle", new Vehicle());
		return view;
	}

	@PostMapping("/addVehicle")
	public String addVehicle(@Valid @ModelAttribute Vehicle vehicle, BindingResult result, Model model) {
		String view = "";

		if (result.hasErrors()) {
			view = "addVehiclePage";
		} else {

			int id = service.addVehcile(vehicle);

			if (id != 0) {
				view = "vehicleResponse";
				model.addAttribute("msg", id);
			}
		}
		return view;
	}

	@GetMapping("/getVehicles")
	public String getVehicles(Model model) {

		String view = "";
		List<Vehicle> list = service.getVehicles();
		if (list != null) {
			view = "vehicleList";
			model.addAttribute("list", list);
		}
		return view;
	}

	@GetMapping("/deleteVehicle")
	public String deleteVehicle(@RequestParam("vid") int id, Model model) {

		String view = "";
		List<Vehicle> list = service.deleteVehicle(id);
		if (list != null) {
			view = "vehicleList";
			model.addAttribute("list", list);
		}
		return view;
	}

}
