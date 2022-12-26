package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class AdminDetails {

    private String adminId;
    private String name;
    private Date online;
    private Date offline;
    private String lastOffline;


}
