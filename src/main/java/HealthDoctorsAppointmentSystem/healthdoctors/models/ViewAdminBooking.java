package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
public class ViewAdminBooking {
    private String bookingType;
    private String adminId;
    private String medicalBookingDept;
    private String AdminBookingHistory;
    private Set<Date> adminSchedule;

}
