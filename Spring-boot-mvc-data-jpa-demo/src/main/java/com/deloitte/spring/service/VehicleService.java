package com.deloitte.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.spring.dao.VehicleRepository;
import com.deloitte.spring.entity.Vehicle;

@Service
@Transactional
public class VehicleService {

	@Autowired
	VehicleRepository repository;

	public int addVehcile(Vehicle vehicle) {
		repository.save(vehicle);
		return vehicle.getId();
	}

	public List<Vehicle> getVehicles() {
		return repository.findAll();
	}

	public List<Vehicle> deleteVehicle(int id) {
		repository.deleteById(id);
		return repository.findAll();
	}
}
