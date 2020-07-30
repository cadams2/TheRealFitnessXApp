package com.example.TheRealFitnessXApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fitnessappx")
public class FitnessController {

    @Autowired
    FitnessRepository repository;

    @GetMapping
    public List<FitnessUserData> readAllMessages(){
        return  repository.findAll();
    }

    @GetMapping("/{id}")
    public FitnessUserData readOneMessageBy(@PathVariable UUID id){
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public FitnessUserData createMessage(@RequestBody FitnessUserData message){
        return repository.save(message);
    }

    @PutMapping("/{id}")
    public FitnessUserData updateMessage(@PathVariable UUID id, @RequestBody FitnessUserData fitnessStuff){
        FitnessUserData fitnessToEdit = repository.findById(id).orElse(null);

        if(fitnessToEdit == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Fitness User Data not Found.");
        }

        fitnessToEdit.setFirstName(fitnessStuff.getFirstName());
        fitnessToEdit.setLastName(fitnessStuff.getLastName());
        fitnessToEdit.setEmail(fitnessStuff.getEmail());
        fitnessToEdit.setWeight(fitnessStuff.getWeight());
        fitnessToEdit.setHeight(fitnessStuff.getHeight());
        fitnessToEdit.setGender(fitnessStuff.getGender());

        fitnessToEdit.setWaterIntake(fitnessStuff.getWaterIntake());
        fitnessToEdit.setDailySteps(fitnessStuff.getDailySteps());
        fitnessToEdit.setCaloriesBurned(fitnessStuff.getCaloriesBurned());

        return repository.save(fitnessToEdit);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable UUID id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        }
    }
}
