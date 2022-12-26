package HealthDoctorsAppointmentSystem.healthdoctors.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewDoctorBooking extends JpaRepository<ViewDoctorBooking,String> {
}
