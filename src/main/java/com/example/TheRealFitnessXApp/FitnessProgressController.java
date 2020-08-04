package com.example.TheRealFitnessXApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/fitnessprogress")
public class FitnessProgressController {

    @Autowired
    FitnessProgressRepository repository;



    @GetMapping("/{userId}")
    public List<FitnessUserProgress> getWeeklyProgress(@PathVariable("userId") FitnessUserData user) {

        return  repository.findTop7ByUserOrderByCreated(user);
    }

    @PostMapping
    public FitnessUserProgress postProgress(@RequestBody FitnessUserProgress message){
        return repository.save(message);
    }

}
