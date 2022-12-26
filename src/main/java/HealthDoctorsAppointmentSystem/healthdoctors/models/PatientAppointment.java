package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
public class PatientAppointment{

    private String patientId;
    private String patientName;
    private String patientHistory;
    private Date patientReminder;
    private String patientGmail;
    private Set<Date> patientScheduleTime;
}
