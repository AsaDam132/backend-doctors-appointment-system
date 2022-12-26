package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CancelDoctorBooking {
    private String doctorId;
    private String doctorName;
    private String reasonToCancelDoctorBooking;


}
