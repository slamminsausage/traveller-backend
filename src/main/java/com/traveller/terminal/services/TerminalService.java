package com.traveller.terminal.services;

import com.traveller.terminal.models.Terminal;
import com.traveller.terminal.repositories.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TerminalService {
    @Autowired
    private TerminalRepository terminalRepository;
    
    public Terminal getTerminalByName(String name) {
        return terminalRepository.findByName(name);
    }
    
    public List<Terminal> getAllTerminals() {
        return terminalRepository.findAll();
    }
}
