package interfaces;

import model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerson extends CrudRepository<Person,Integer> {

}
