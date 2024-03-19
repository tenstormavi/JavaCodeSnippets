package LLD.CoachingCenter;

import LLD.CoachingCenter.AbstractClass.Student;
import LLD.CoachingCenter.AbstractClass.Teacher;
import LLD.CoachingCenter.Model.Slot;

import java.util.ArrayList;
import java.util.List;

public class CoachingCenter {
    private static CoachingCenter instance;
    private String name;
    private String pincode;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Slot> slots = new ArrayList<>();

    private CoachingCenter() {}

    public static CoachingCenter getInstance() {
        if (instance == null) {
            instance = new CoachingCenter();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addSlot(String time, Teacher teacher) {
        slots.add(new Slot(time, teacher));
    }

    public List<Slot> getSlotsBySubject(String subject) {
        List<Slot> availableSlots = new ArrayList<>();
        for (Slot slot : slots) {
            if (slot.getTeacher().getSubject().equalsIgnoreCase(subject) && !slot.isBooked()) {
                availableSlots.add(slot);
            }
        }
        return availableSlots;
    }

    public synchronized void bookSlot(Student student, Slot slot) {
        if (slot.bookSlot(student)) {
            System.out.println(student.getName() + " successfully booked the slot for " + slot.getTime());
        } else {
            System.out.println("Slot at " + slot.getTime() + " is already booked.");
        }
    }

    public void printSlots() {
        for (Slot slot : slots) {
            System.out.println(slot.getBookingDetails());
        }
    }
}
