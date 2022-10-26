package kodluyoruz.spring.Converter;

import kodluyoruz.spring.Entity.WorkToDo;
import kodluyoruz.spring.RequestDto.DeleteToDoRequestDto;
import kodluyoruz.spring.ResponseDto.WorkToDoResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkToDoConverter {



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

}
