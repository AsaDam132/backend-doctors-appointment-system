package HealthDoctorsAppointmentSystem.healthdoctors.repositories;

import HealthDoctorsAppointmentSystem.healthdoctors.models.DoctorAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorAppointmentRepository extends JpaRepository<DoctorAppointment,String> {
}
