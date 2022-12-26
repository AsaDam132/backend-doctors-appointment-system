package HealthDoctorsAppointmentSystem.healthdoctors.repositories;

import HealthDoctorsAppointmentSystem.healthdoctors.models.ViewPatientBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewPatientRepository extends JpaRepository<ViewPatientBooking,String> {
}
