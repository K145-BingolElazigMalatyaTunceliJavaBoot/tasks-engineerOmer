package kodluyoruz.spring.Service;

import kodluyoruz.spring.Converter.WorkToDoConverter;
import kodluyoruz.spring.Entity.WorkToDo;
import kodluyoruz.spring.Repository.WorkToDoRepository;
import kodluyoruz.spring.RequestDto.AddToDo;
import kodluyoruz.spring.RequestDto.DeleteToDo;
import kodluyoruz.spring.ResponseDto.WorkToDoResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkToDoService {

    @Autowired
    WorkToDoRepository workToDoRepository;

    @Autowired
    WorkToDoConverter workToDoConverter;

    public String addToDo(AddToDo addToDo){
        WorkToDo workToDo = workToDoConverter.convertWorkToDoAddToDo(addToDo);
        workToDo = workToDoRepository.save(workToDo);
        return String.valueOf(workToDo.getId());
    }

    public List<WorkToDoResponseDto> getWorkToDoListByMission(String mission){
        List<WorkToDo> workToDoList = workToDoRepository.findAllByMission(mission);

        List<WorkToDoResponseDto> workToDoResponseDtos = workToDoConverter.convertWorkToDoListToWorkToDoResponseDtoList(workToDoList);
        return workToDoResponseDtos;
    }
    public String deletToDo(DeleteToDo deleteToDo){
        WorkToDo workToDo = workToDoConverter.convertRemoveWorkToDo(deleteToDo);
        workToDoRepository.delete(workToDo);
        return String.valueOf(workToDo.getId());
    }
    public List<WorkToDoResponseDto> getWorkToDoListDays(String days){
        List<WorkToDo> workToDoList = workToDoRepository.findByDay(days);
        List<WorkToDoResponseDto> workToDoResponseDtoss = workToDoConverter.convertWorkToDoListDays(workToDoList);
        return workToDoResponseDtoss;
    }
}
