package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CancelPatientBooking {
    private String patientId;
    private String patientName;
    private String reasonToCancelPatientBooking;
}
