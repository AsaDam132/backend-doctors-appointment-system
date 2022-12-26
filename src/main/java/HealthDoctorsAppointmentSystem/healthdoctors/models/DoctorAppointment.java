package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
public class DoctorAppointment {
    private String doctorName;
    private String doctorId;
    private Set<Date> scheduleTime;
    private String doctorDept;
    private String doctorYearOfExperience;
    private String doctorHistory;

}







