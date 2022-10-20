package kodluyoruz.spring.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    private String mission;

    @Column(name = "day")
    private String day;

    @Column(name = "done")
    private boolean done;



}
