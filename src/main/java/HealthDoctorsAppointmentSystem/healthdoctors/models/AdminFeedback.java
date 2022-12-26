package HealthDoctorsAppointmentSystem.healthdoctors.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@NoArgsConstructor
public class AdminFeedback {

    private String adminId;
    private String dailyReport;
    private Time ReportTime;
    private String commonComplaint;
}
