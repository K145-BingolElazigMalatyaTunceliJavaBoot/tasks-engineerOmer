package kodluyoruz.spring.Controller;



import kodluyoruz.spring.Entity.WorkToDo;
import kodluyoruz.spring.RequestDto.AddToDo;
import kodluyoruz.spring.RequestDto.DeleteToDo;
import kodluyoruz.spring.RequestDto.UpdateToDo;
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

    private WorkToDoService workToDoService;

    @Autowired
    public WorkToDoController(WorkToDoService workToDoService) {
        this.workToDoService = workToDoService;
    }

    @GetMapping("/workToDoListDay")
    public ResponseEntity<List<WorkToDoResponseDto>> getWorkToDoByMission(@RequestParam String day){
        List<WorkToDoResponseDto> workToDoResponseDtoList;
        try {
            workToDoResponseDtoList=workToDoService.getWorkToDoListByMission(day);
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

    @PatchMapping("/updateMission")
    public ResponseEntity<String> isDone(@RequestBody UpdateToDo updateToDo){
          workToDoService.updateMission(updateToDo);
          return  new ResponseEntity<String>("Is durumu guncellemesi basaraiyla yapildi",HttpStatus.OK);

    }

    @GetMapping("/listOfWeek")
    public ResponseEntity<List<WorkToDo>> getAllByWeek(@RequestParam int page,@RequestParam int pageSize){
        return new ResponseEntity<List<WorkToDo>>(this.workToDoService.getAll(page,pageSize),HttpStatus.OK);
    }





}
