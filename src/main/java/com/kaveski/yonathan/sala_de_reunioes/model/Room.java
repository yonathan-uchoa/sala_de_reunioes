package com.kaveski.yonathan.sala_de_reunioes.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="meeting_room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = true)
    private LocalDateTime startHour;
    @Column(nullable = true)
    private LocalDateTime endHour;

    @Override
    public String toString(){
        return "Room [id="+id+",name="+name+",date="+date+",startHour="+startHour+",endHour="+endHour+"]";
    }
}
