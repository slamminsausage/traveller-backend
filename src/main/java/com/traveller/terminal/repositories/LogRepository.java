package com.traveller.terminal.repositories;

import com.traveller.terminal.models.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<LogEntry, Long> {
    // For example, find logs by a terminal's location if that fits your schema:
    List<LogEntry> findByLocation(String location);
}
