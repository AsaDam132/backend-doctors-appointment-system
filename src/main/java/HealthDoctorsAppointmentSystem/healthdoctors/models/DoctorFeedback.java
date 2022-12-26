package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DoctorFeedback {

    private String doctorId;
    private String doctorName;
    private String doctorFeedback;

}
