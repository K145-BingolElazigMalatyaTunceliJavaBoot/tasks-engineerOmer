package kodluyoruz.spring.Service;

import kodluyoruz.spring.Converter.WorkToDoConverter;
import kodluyoruz.spring.Entity.WorkToDo;
import kodluyoruz.spring.Repository.WorkToDoRepository;
import kodluyoruz.spring.RequestDto.AddToDo;
import kodluyoruz.spring.RequestDto.DeleteToDo;
import kodluyoruz.spring.RequestDto.UpdateToDo;
import kodluyoruz.spring.ResponseDto.WorkToDoResponseDto;
import kodluyoruz.spring.core.utilities.results.DataResult;
import kodluyoruz.spring.core.utilities.results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import java.util.List;

@Service
public class WorkToDoService {

    private WorkToDoRepository workToDoRepository;

    public WorkToDoService(WorkToDoRepository workToDoRepository) {
        this.workToDoRepository = workToDoRepository;
    }

    @Autowired
    WorkToDoConverter workToDoConverter;

    public String addToDo(AddToDo addToDo){
        WorkToDo workToDo = workToDoConverter.convertWorkToDoAddToDo(addToDo);
        workToDo = workToDoRepository.save(workToDo);
        return String.valueOf(workToDo.getId());
    }

    public List<WorkToDoResponseDto> getWorkToDoListByMission(String day){
        List<WorkToDo> workToDoList = workToDoRepository.findByDay(day);

        List<WorkToDoResponseDto> workToDoResponseDtos = workToDoConverter.convertWorkToDoListToWorkToDoResponseDtoList(workToDoList);
        return workToDoResponseDtos;
    }

    public String deletToDo(DeleteToDo deleteToDo){
        WorkToDo workToDo = workToDoConverter.convertRemoveWorkToDo(deleteToDo);
        workToDoRepository.delete(workToDo);
        return String.valueOf(workToDo.getId());
    }

    public void updateMission(UpdateToDo updateToDo){
        WorkToDo workToDo =workToDoRepository.getById(updateToDo.getId());
        workToDo.setDone(updateToDo.isDone());
        workToDoRepository.save(workToDo);


    }
    public List<WorkToDo> getAll(int pageNo, int pageSize) {

        Pageable pageable =  PageRequest.of(pageNo-1, pageSize);

        return  this.workToDoRepository.findAll(pageable).getContent();
    }



}
