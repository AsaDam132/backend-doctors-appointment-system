package HealthDoctorsAppointmentSystem.healthdoctors.repositories;

import HealthDoctorsAppointmentSystem.healthdoctors.models.CancelAdminBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancelAdminRepository extends JpaRepository<CancelAdminBooking, String> {
}
