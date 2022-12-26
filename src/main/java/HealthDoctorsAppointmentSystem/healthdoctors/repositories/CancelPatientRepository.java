package HealthDoctorsAppointmentSystem.healthdoctors.repositories;

import HealthDoctorsAppointmentSystem.healthdoctors.models.CancelPatientBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancelPatientRepository extends JpaRepository<CancelPatientBooking,String> {
}
