package com.kaveski.yonathan.sala_de_reunioes.controller;


import com.kaveski.yonathan.sala_de_reunioes.exception.ResourceNotFoundException;
import com.kaveski.yonathan.sala_de_reunioes.model.Room;
import com.kaveski.yonathan.sala_de_reunioes.repository.RoomRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")


public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    @GetMapping("/rooms/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable(value = "id") Long roomId) throws ResourceNotFoundException{
        Room room = roomRepository.findById(roomId).orElseThrow( () ->
                new ResourceNotFoundException("Room not found! :: "+ roomId)
        );
        return ResponseEntity.ok().body(room);
    }

    @PostMapping("/rooms")
    public Room createRoom(@Valid @RequestBody Room room){
        return roomRepository.save(room);
    }

    @PutMapping("/rooms/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable(value = "id")Long roomId,
                                           @Valid @RequestBody Room roomDetails) throws ResourceNotFoundException{

        Room room = roomRepository.findById(roomId).orElseThrow( () ->
                new ResourceNotFoundException("Room not found! :: "+ roomId)
        );
        roomDetails.setId(roomId);
        roomRepository.save(roomDetails);
        return ResponseEntity.ok().body(room);
    }

    @DeleteMapping("/rooms/{id}")
    public Map<String, Boolean> deleteRoom(@PathVariable(value = "id") Long roomId) throws ResourceNotFoundException{
        Room room = roomRepository.findById(roomId).orElseThrow( () ->
                new ResourceNotFoundException("Room not found! :: "+ roomId)
        );
        roomRepository.delete(room);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return response;
    }
}
