package kodluyoruz.spring.Repository;

import kodluyoruz.spring.Entity.WorkToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkToDoRepository extends CrudRepository<WorkToDo,Integer> {

     List<WorkToDo> findAllByMission(String mission);

     List<WorkToDo> findByDay(String days);
}
