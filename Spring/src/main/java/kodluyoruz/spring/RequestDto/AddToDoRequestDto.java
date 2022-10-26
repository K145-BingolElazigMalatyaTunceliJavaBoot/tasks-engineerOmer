package kodluyoruz.spring.RequestDto;


import lombok.Data;

@Data
public class AddToDoRequestDto {
    private int id;

    private String mission;

    private String  day;

    private boolean done;





}
