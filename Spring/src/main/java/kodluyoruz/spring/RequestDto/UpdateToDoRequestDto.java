package kodluyoruz.spring.RequestDto;

import lombok.Data;

@Data
public class UpdateToDoRequestDto {

    private int id;
    private boolean done;
}
