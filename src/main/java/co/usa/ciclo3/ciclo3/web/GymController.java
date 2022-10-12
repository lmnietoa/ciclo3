package co.usa.ciclo3.ciclo3.web;

import co.usa.ciclo3.ciclo3.model.Gym;
import co.usa.ciclo3.ciclo3.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Gym")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class GymController {
    @Autowired
    private GymService gymService;

    @GetMapping("/all")
    public List<Gym> getGym(){
        return gymService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Gym> getGym(@PathVariable("id") int id){
        return gymService.getGym(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Gym save(@RequestBody Gym g){
        return gymService.save(g);
    }
}
