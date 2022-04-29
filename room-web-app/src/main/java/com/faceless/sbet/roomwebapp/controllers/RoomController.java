package com.faceless.sbet.roomwebapp.controllers;

import com.faceless.sbet.roomwebapp.models.Room;
import com.faceless.sbet.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/room")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model) {
            model.addAttribute("rooms", this.roomService.getAllRooms());
        return "rooms";
    }
}
