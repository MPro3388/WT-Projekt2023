package com.example.WTProjekt2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DroneService {

    @Autowired
    DroneRepository repo;

    public Drone save(Drone drone){
        return repo.save(drone);
    }

    public Drone get(Integer id){
        return repo.findById(id).orElseThrow( () -> new RuntimeException());
    }

    public List<Drone> getAll() {
        Iterable<Drone> iterator = repo.findAll();
        List<Drone> drone = new ArrayList<Drone>();
        for (Drone drones : iterator)  drone.add(drones);
        return drone;
    }
}

