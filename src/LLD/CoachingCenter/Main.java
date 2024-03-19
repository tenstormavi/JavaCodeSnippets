package LLD.CoachingCenter;

import LLD.CoachingCenter.AbstractClass.Student;
import LLD.CoachingCenter.AbstractClass.Teacher;
import LLD.CoachingCenter.Model.Slot;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoachingCenter center = CoachingCenter.getInstance();
        center.setName("ABC Coaching Center");
        center.setPincode("123456");

        // Create teacher
        Teacher john = new Teacher("Satish", "Maths", center);
        Teacher paras = new Teacher("Paras", "Physics", center);
        center.addTeacher(john);
        center.addTeacher(paras);

        // Adding slots
        center.addSlot("4-5 PM", john);
        center.addSlot("4-5 PM", paras);

        // Creating students
        Student rohan = new Student("Rohan");
        Student rahul = new Student("Rahul");
        center.addStudent(rohan);
        center.addStudent(rahul);

        // Alice searches for available Physics slots
        List<Slot> physicsSlots = center.getSlotsBySubject("Physics");
        if (!physicsSlots.isEmpty()) {
            center.bookSlot(rohan, physicsSlots.get(0));
        }

        // Bob tries to book the same slot
        if (!physicsSlots.isEmpty()) {
            center.bookSlot(rahul, physicsSlots.get(0));
        }

        // Print all slot statuses
        center.printSlots();
    }
}
