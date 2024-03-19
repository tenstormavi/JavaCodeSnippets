package LLD.CoachingCenter.Model;

import LLD.CoachingCenter.AbstractClass.Student;
import LLD.CoachingCenter.AbstractClass.Teacher;

public class Slot {

    private final String time;
    private final Teacher teacher;
    private volatile boolean isBooked;
    private Student bookedBy;

    public Slot(String time, Teacher teacher) {
        this.time = time;
        this.teacher = teacher;
        this.isBooked = false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public String getTime() {
        return time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public synchronized boolean bookSlot(Student student) {
        if (!isBooked) {
            this.bookedBy = student;
            this.isBooked = true;
            return true;
        }
        return false;
    }

    public String getBookingDetails() {
        if (isBooked) {
            return "Booked by " + bookedBy.getName() + " for " + teacher.getSubject() + " at " + time;
        }
        return "Available for " + teacher.getSubject() + " at " + time;
    }
}
