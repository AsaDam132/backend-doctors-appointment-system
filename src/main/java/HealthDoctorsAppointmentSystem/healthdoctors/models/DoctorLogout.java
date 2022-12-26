package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DoctorLogout {
    private String doctorName;
    private String doctorPassword;

}
