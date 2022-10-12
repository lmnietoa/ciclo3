package co.usa.ciclo3.ciclo3.service;


import co.usa.ciclo3.ciclo3.model.Gym;
import co.usa.ciclo3.ciclo3.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymService {
    @Autowired
    private GymRepository gymRepository;
    public List<Gym> getAll(){
        return gymRepository.getAll();
    }
    public Optional<Gym> getGym(int id){
        return gymRepository.getGym(id);
    }
    public Gym save(Gym g){
        if(g.getId()==null){
            return gymRepository.save(g);
        }else{
            Optional<Gym> gaux=gymRepository.getGym(g.getId());
            if(gaux.isEmpty()){
                return gymRepository.save(g);
            }else {
                return g;
            }
        }
    }
}
