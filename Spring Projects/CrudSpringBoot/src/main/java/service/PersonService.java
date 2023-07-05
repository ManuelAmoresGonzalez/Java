package service;

import interfaceService.IPersonService;
import interfaces.IPerson;
import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private IPerson data;
    @Override
    public List<Person> listar() {
        return (List<Person>)data.findAll();
    }

    @Override
    public Optional<Person> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Person p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
