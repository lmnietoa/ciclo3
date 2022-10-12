package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.Gym;
import co.usa.ciclo3.ciclo3.repository.crud.GymCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class GymRepository {
    @Autowired
    private GymCrudRepository gymCrudRepository;
    public List<Gym> getAll(){
        return (List<Gym>) gymCrudRepository.findAll();
    }
    public Optional<Gym> getGym(int id){
        return gymCrudRepository.findById(id);
    }
    public Gym save(Gym g){
        return gymCrudRepository.save(g);
    }
}
