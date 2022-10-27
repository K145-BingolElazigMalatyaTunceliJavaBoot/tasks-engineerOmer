package kodluyoruz.spring.Controller;



import kodluyoruz.spring.Entity.WorkToDo;
import kodluyoruz.spring.RequestDto.AddToDoRequestDto;
import kodluyoruz.spring.RequestDto.DeleteToDoRequestDto;
import kodluyoruz.spring.RequestDto.UpdateToDoRequestDto;
import kodluyoruz.spring.ResponseDto.WorkToDoResponseDto;
import kodluyoruz.spring.Service.WorkToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/worktodo")
@RequiredArgsConstructor
public class WorkToDoController {

    private final WorkToDoService workToDoService;

    @GetMapping("/workToDoListDay")
    public ResponseEntity<List<WorkToDoResponseDto>> getWorkToDoByMission(@RequestParam String day){
        List<WorkToDoResponseDto> workToDoListByDay = workToDoService.getWorkToDoListByDay(day);
        return new ResponseEntity<>(workToDoListByDay,HttpStatus.OK);
    }


    @PostMapping("/addWorkToDo")
    public ResponseEntity<String> addWorkToDo(@RequestBody AddToDoRequestDto addToDoRequestDto){
        String WorkToDoId = workToDoService.addToDo(addToDoRequestDto);
        return new ResponseEntity<>(WorkToDoId, HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteWorkToDo")
    public ResponseEntity<String> deleteWorkToDo(@RequestBody DeleteToDoRequestDto deleteToDoRequestDto){
        String WorkToDoId = workToDoService.deletToDo(deleteToDoRequestDto);
        return new ResponseEntity<>(WorkToDoId,HttpStatus.OK);
    }

    @PatchMapping("/updateMission")
    public ResponseEntity<String> isDone(@RequestBody UpdateToDoRequestDto updateToDoRequestDto){
        String userReturnMessage = workToDoService.updateMission(updateToDoRequestDto);
        return  new ResponseEntity<String>(userReturnMessage,HttpStatus.OK);

    }

    @GetMapping("/listOfWeek")
    public ResponseEntity<List<WorkToDo>> getAllByWeek(@RequestParam int page,@RequestParam int pageSize){
        return new ResponseEntity<List<WorkToDo>>(this.workToDoService.getAll(page,pageSize),HttpStatus.OK);
    }





}
