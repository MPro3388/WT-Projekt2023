package com.example.WTProjekt2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DroneController {

    @Autowired
    DroneService service;

    //Logger logger = LoggerFactory.getLogger(DroneController.class);
    @PostMapping("/drone")
    public Drone createDrone(@RequestBody Drone drone){
        return service.save(drone);
    }

    @GetMapping("/drone/{id}")
    public Drone getDrone(@PathVariable String id){
        //logger.info("GET request on route drones with {}", id);
        Integer droneId = Integer.parseInt(id);
        return service.get(droneId);
    }

    @GetMapping("/drone")
    public List<Drone> getAllThings() {
        return service.getAll();
    }


}
