package HealthDoctorsAppointmentSystem.healthdoctors.repositories;

import HealthDoctorsAppointmentSystem.healthdoctors.models.PatientAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientAppointment,String> {
}
