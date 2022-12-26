package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
public class ViewPatientBooking {
    private String patientId;
    private String patientGmail;
    private String patientMedicalHistory;
    private Set<Date> patientScheduleTime;

}
