package com.traveller.terminal.controllers;

import com.traveller.terminal.models.Terminal;
import com.traveller.terminal.services.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/terminals")
@CrossOrigin(origins = "*")
public class TerminalController {
    @Autowired
    private TerminalService terminalService;
    
    @GetMapping
    public List<Terminal> getTerminals() {
        return terminalService.getAllTerminals();
    }
    
    @GetMapping("/{name}")
    public Terminal getTerminal(@PathVariable String name) {
        return terminalService.getTerminalByName(name);
    }
}
