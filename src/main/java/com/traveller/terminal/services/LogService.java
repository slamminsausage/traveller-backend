package com.traveller.terminal.services;

import com.traveller.terminal.models.LogEntry;
import com.traveller.terminal.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LogService {
    @Autowired
    private LogRepository logRepository;
    
    public List<LogEntry> getLogsByLocation(String location) {
        return logRepository.findByLocation(location);
    }
    
    public Optional<LogEntry> getLogById(Long id) {
        return logRepository.findById(id);
    }
    
    public List<LogEntry> getAllLogs() {
        return logRepository.findAll();
    }
}
