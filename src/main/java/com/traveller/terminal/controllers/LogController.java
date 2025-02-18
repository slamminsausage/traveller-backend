package com.traveller.terminal.controllers;

import com.traveller.terminal.models.LogEntry;
import com.traveller.terminal.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/logs")
@CrossOrigin(origins = "*")
public class LogController {
    @Autowired
    private LogService logService;
    
    // Optionally, get logs by terminal location (if you link them that way)
    @GetMapping("/byLocation/{location}")
    public List<LogEntry> getLogsByLocation(@PathVariable String location) {
        return logService.getLogsByLocation(location);
    }
    
    @GetMapping
    public List<LogEntry> getAllLogs() {
        return logService.getAllLogs();
    }
}
