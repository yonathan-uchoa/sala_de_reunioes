package com.kaveski.yonathan.sala_de_reunioes.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="meeting_room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String date;
    @Column(nullable = true)
    private String startHour;
    @Column(nullable = true)
    private String endHour;

    @Override
    public String toString(){
        return "Room [id="+id+",name="+name+",date="+date+",startHour="+startHour+",endHour="+endHour+"]";
    }
}
