package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class AdminAppointment {

    private String adminId;
    private Date  adminAppointmentDate;
    private String appUserComplaint;
}
