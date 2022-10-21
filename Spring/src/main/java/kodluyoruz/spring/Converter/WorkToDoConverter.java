package kodluyoruz.spring.Converter;

import kodluyoruz.spring.Entity.WorkToDo;
import kodluyoruz.spring.RequestDto.AddToDo;
import kodluyoruz.spring.RequestDto.DeleteToDo;
import kodluyoruz.spring.RequestDto.UpdateToDo;
import kodluyoruz.spring.ResponseDto.WorkToDoResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkToDoConverter {

    public WorkToDo convertWorkToDoAddToDo(AddToDo addToDo){
        WorkToDo workToDo = new WorkToDo();
        workToDo.setId(addToDo.getId());
        workToDo.setMission(addToDo.getMission());
        workToDo.setDay(addToDo.getDay());
        workToDo.setDone(addToDo.isDone());
        return workToDo;
    }

    public List<WorkToDoResponseDto> convertWorkToDoListToWorkToDoResponseDtoList(List<WorkToDo> workToDoList){

        List<WorkToDoResponseDto> workToDoResponseDtoList = new ArrayList<>();

        for(WorkToDo workToDo : workToDoList){
            WorkToDoResponseDto workToDoResponseDto = new WorkToDoResponseDto();
            workToDoResponseDto.setId(workToDo.getId());
            workToDoResponseDto.setMission(workToDo.getMission());
            workToDoResponseDto.setDay(workToDo.getDay());
            workToDoResponseDtoList.add(workToDoResponseDto);
        }

        return workToDoResponseDtoList;

    }
    public WorkToDo convertRemoveWorkToDo(DeleteToDo deleteToDo){
        WorkToDo workToDo = new WorkToDo();
        workToDo.setId(deleteToDo.getId());
        return workToDo;
    }

    public List<WorkToDoResponseDto> convertWorkToDoListDays(List<WorkToDo> workToDoList){
        List<WorkToDoResponseDto> workToDoResponseDtoListDays = new ArrayList<>();
        for (WorkToDo workToDo : workToDoList){
            WorkToDoResponseDto workToDoResponseDto = new WorkToDoResponseDto();
            workToDoResponseDto.setDay(workToDo.getDay());
        }
        return workToDoResponseDtoListDays;
    }

    public WorkToDo updateMission(UpdateToDo updateToDo){
        WorkToDo workToDo = new WorkToDo();
        workToDo.setDone(updateToDo.isDone());
        return workToDo;
    }
}
