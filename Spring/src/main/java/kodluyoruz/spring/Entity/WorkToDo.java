package kodluyoruz.spring.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Objects;

@NoArgsConstructor

@Data
@Entity
@Table(name="WORKTODO")
public class WorkToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int id;

    @Column(name = "mission")
    private String  mission;

    @Column(name = "day")
    private String day;

    @Column(name = "done")
    private boolean done;

    //HEPSINI @DATA ANNOTATION ILE YAPABILIRIZ//@DATA DEFAULT OLARAK KULLANIR.
   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkToDo workToDo = (WorkToDo) o;
        return id == workToDo.id && done == workToDo.done && Objects.equals(mission, workToDo.mission) && Objects.equals(day, workToDo.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mission, day, done);
    }

    //CONSOLDA PAKET YOLU YERINE JSON FORMATINDA GOZUKMESI ICIN KULLANILIR
    //CLASS'IN GORUNURLUGUNU AYARLAR
    @Override
    public String toString() {
        return "WorkToDo{" +
                "id=" + id +
                ", mission='" + mission + '\'' +
                ", day='" + day + '\'' +
                ", done=" + done +
                '}';
    }*/
}
