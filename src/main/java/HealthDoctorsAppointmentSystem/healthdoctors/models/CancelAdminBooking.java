package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CancelAdminBooking {
    private String adminid;
    private String reasonTocancel;
    private String adminName;
    private String cancelAdmin;
}
