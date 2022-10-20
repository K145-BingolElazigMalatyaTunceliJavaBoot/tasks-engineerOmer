package kodluyoruz.spring.Controller;


import kodluyoruz.spring.RequestDto.AddToDo;
import kodluyoruz.spring.RequestDto.DeleteToDo;
import kodluyoruz.spring.ResponseDto.WorkToDoResponseDto;
import kodluyoruz.spring.Service.WorkToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/worktodo")
public class WorkToDoController {


    @Autowired
    WorkToDoService workToDoService;

    @GetMapping("/workToDoList")
    public ResponseEntity<List<WorkToDoResponseDto>> getWorkToDoByMission(@RequestParam String mission){
        List<WorkToDoResponseDto> workToDoResponseDtoList;
        try {
            workToDoResponseDtoList=workToDoService.getWorkToDoListByMission(mission);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<List<WorkToDoResponseDto>>(workToDoResponseDtoList,HttpStatus.OK);
    }



    @PostMapping("/addWorkToDo")
    public ResponseEntity<String> addWorkToDo(@RequestBody AddToDo addToDo){
        String WorkToDoId = workToDoService.addToDo(addToDo);
        return new ResponseEntity<>(WorkToDoId, HttpStatus.OK);
    }
    @DeleteMapping("/deleteWorkToDo")
    public ResponseEntity<String> deleteWorkToDo(@RequestBody DeleteToDo deleteToDo){
        String WorkToDoId = workToDoService.deletToDo(deleteToDo);
        return new ResponseEntity<>(WorkToDoId,HttpStatus.OK);
    }
    @GetMapping("/WorkToDoListDays")
    public ResponseEntity<List<WorkToDoResponseDto>> getWorkToDoByDays(@RequestParam String days){
        List<WorkToDoResponseDto> workToDoResponseDtoList= null;
        try {
            workToDoResponseDtoList=workToDoService.getWorkToDoListDays(days);
            return new ResponseEntity<>(workToDoResponseDtoList,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }

    }


}
