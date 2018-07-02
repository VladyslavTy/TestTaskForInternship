package person;

import institution.SourseOfKnowledge;

public class SelfStudy extends SourseOfKnowledge {
    Student student;
    int factorOfPractice;
    int factorOfTheory;

    public SelfStudy(Student student, int factorOfPractice, int factorOfTheory) {
        this.student = student;
        this.factorOfPractice = factorOfPractice;
        this.factorOfTheory = factorOfTheory;
    }

    @Override
    public void givePracticalKnowledge(Student student) {
        super.givePracticalKnowledge(student);
        student.knowledge.levelOfPractice += student.learningFactor * factorOfPractice;

    }

    @Override
    public void giveTheoryKnowledge(Student student) {
        super.giveTheoryKnowledge(student);
        student.knowledge.levelOfTheory += student.learningFactor * factorOfTheory;

    }
}