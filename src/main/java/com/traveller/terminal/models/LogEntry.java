package com.traveller.terminal.models;

import jakarta.persistence.*;

@Entity
@Table(name = "log_entry")
public class LogEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String location;
    private String date;
    private String author;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "security_level")
    private String securityLevel;

    @Column(name = "requires_roll")
    private Boolean requiresRoll;

    // Roll check details
    private Integer rollDifficulty;
    private String rollSkill;

    @Column(name = "roll_on_success", columnDefinition = "TEXT")
    private String rollOnSuccess;

    @Column(name = "roll_on_failure", columnDefinition = "TEXT")
    private String rollOnFailure;

    public LogEntry() {}

    // Include getters and setters for all fields
    // (Constructor, getters, and setters can be generated automatically)
}
