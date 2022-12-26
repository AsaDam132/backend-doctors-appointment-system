package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
public class ViewDoctorBooking {
    private String doctorId;
    private String medicalDoctorHistory;
    private String doctorGmail;
    private Set<Date> doctorScheduleTime;
}
