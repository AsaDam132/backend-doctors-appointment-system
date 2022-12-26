package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "doctors-details")
public class DoctorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctorId", unique = true)
    private String doctorId;

    private String doctorName;
    private String doctorDept;
    private String doctorExperience;
    private String doctorsEducation;
    private String doctorsHonours;

}
