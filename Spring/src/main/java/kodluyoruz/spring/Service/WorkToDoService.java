package kodluyoruz.spring.Service;

import kodluyoruz.spring.Converter.WorkToDoConverter;
import kodluyoruz.spring.Entity.WorkToDo;
import kodluyoruz.spring.Repository.WorkToDoRepository;
import kodluyoruz.spring.RequestDto.AddToDoRequestDto;
import kodluyoruz.spring.RequestDto.DeleteToDoRequestDto;
import kodluyoruz.spring.RequestDto.UpdateToDoRequestDto;
import kodluyoruz.spring.ResponseDto.WorkToDoResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WorkToDoService {


    //
    private final WorkToDoRepository workToDoRepository;

    private final WorkToDoConverter workToDoConverter;

    private final ModelMapper modelMapper;

    //required gordugu final degiskenler icin constructor olusturur.Business katmaninda tercih edilir
    //allargs butun degerler icin constructor olusturur.Entity katmaninda tercih edilir.
   /* public WorkToDoService(WorkToDoRepository workToDoRepository,WorkToDoConverter workToDoConverter,ModelMapper modelMapper) {
        this.workToDoRepository = workToDoRepository;
        this.workToDoConverter=workToDoConverter;
        this.modelMapper=modelMapper;
    }*/



    public String addToDo(AddToDoRequestDto addToDoRequestDto){
        WorkToDo workToDo = convertToWorkToDoFromWorkToDoRequestDto(addToDoRequestDto);
        workToDo = workToDoRepository.save(workToDo);
        return String.valueOf(workToDo.getId());
    }
    private  WorkToDo convertToWorkToDoFromWorkToDoRequestDto(AddToDoRequestDto addToDoRequestDto){
        WorkToDo workToDo = modelMapper.map(addToDoRequestDto,WorkToDo.class);
        return workToDo;
    }

    public List<WorkToDoResponseDto> getWorkToDoListByDay(String day){
        List<WorkToDoResponseDto> workToDoResponseDtoList = new ArrayList<>();
        List<WorkToDo> workToDoListByDay = workToDoRepository.findByDay(day);
        for (WorkToDo workToDo : workToDoListByDay){
            WorkToDoResponseDto  workToDoResponseDto = modelMapper.map(workToDo,WorkToDoResponseDto.class);
            workToDoResponseDtoList.add(workToDoResponseDto);
        }
        return workToDoResponseDtoList;
    }

    public String deletToDo(DeleteToDoRequestDto deleteToDoRequestDto){
        int id = deleteToDoRequestDto.getId();
        Optional<WorkToDo> workToDoRepositoryById = workToDoRepository.findById(id);
        WorkToDo workToDo = workToDoRepositoryById.get();
        workToDoRepository.deleteById(id);//DELETE ISLEMI DOGRU MU ?
        //workToDoRepository.delete(workToDo);ID ALINIP TABLODAN SATIR MI SILINMELI YOKSA ID SILININCE SATIRDA SILINIR MI?
        return String.valueOf(workToDo.getId());
    }

    public String updateMission(UpdateToDoRequestDto updateToDoRequestDto){
        int id = updateToDoRequestDto.getId();
        boolean updateToDoRequestDtoDone = updateToDoRequestDto.isDone();

        try {
            Optional<WorkToDo> workToDoRepositoryById = workToDoRepository.findById(id);
            if (workToDoRepositoryById.isPresent()){
                WorkToDo workToDo = workToDoRepositoryById.get();
                workToDo.setDone(updateToDoRequestDtoDone);
                workToDoRepository.save(workToDo);
                return "Gorev durumu basarili bir sekilde guncellendi";
            }
            return "Kayitli gorev bulunamadi";
        }catch(Exception e){
            String message = "Bir hata ile karsilasildi";
            e.printStackTrace();
            return message;
        }
    }

    public List<WorkToDo> getAll(int pageNo, int pageSize) {
        Pageable pageable =  PageRequest.of(pageNo-1, pageSize);
        return  this.workToDoRepository.findAll(pageable).getContent();
    }



}
