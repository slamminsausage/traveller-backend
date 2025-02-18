package com.traveller.terminal.repositories;

import com.traveller.terminal.models.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Long> {
    Terminal findByName(String name);
}
