package kodluyoruz.spring.Repository;

import kodluyoruz.spring.Entity.WorkToDo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.net.ContentHandler;
import java.util.List;

@Repository
public interface WorkToDoRepository extends JpaRepository<WorkToDo,Integer> {

     List<WorkToDo>  findAllByMission(String mission);

     List<WorkToDo> findByDay(String days);
     WorkToDo getById(int id);

}
