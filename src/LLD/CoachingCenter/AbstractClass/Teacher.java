package LLD.CoachingCenter.AbstractClass;

import LLD.CoachingCenter.CoachingCenter;

public class Teacher extends Person {
    private final String subject;
    private final CoachingCenter coachingCenter;

    public Teacher(String name, String subject, CoachingCenter coachingCenter) {
        super(name);
        this.subject = subject;
        this.coachingCenter = coachingCenter;
    }

    public String getSubject() {
        return subject;
    }

    public CoachingCenter getCoachingCenter() {
        return coachingCenter;
    }
}
