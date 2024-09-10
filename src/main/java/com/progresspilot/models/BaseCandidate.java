package com.progresspilot.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;

@Getter
@Setter
public class BaseCandidate implements Serializable {

    private static final long serialVersionUID = 1L;

    private String employeeId;
    private String fullName;
    private String position;
    private String department;
    private HashMap<String, LocalDate> positionsHeld;
    private LocalDate joinDate;
    private boolean isCurrentEmployee;
}
