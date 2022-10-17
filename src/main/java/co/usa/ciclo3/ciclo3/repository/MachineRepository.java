package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.Machine;
import co.usa.ciclo3.ciclo3.repository.crud.MachineCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class MachineRepository {
    @Autowired
    private MachineCrudRepository machineCrudRepository;
    public List<Machine> getAll(){
        return (List<Machine>) machineCrudRepository.findAll();
    }
    public Optional<Machine> getMachine(int id){
        return machineCrudRepository.findById(id);
    }
    public Machine save(Machine m){
        return machineCrudRepository.save(m);
    }
}
