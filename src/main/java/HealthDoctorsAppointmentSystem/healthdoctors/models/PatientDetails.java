package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatientDetails {

    private String patientId;
    private String patientName;
    private String patientGmailAddress;
    private String patientMedicalHistory;
    private String patientAge;
}
