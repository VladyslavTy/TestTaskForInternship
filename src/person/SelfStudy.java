package person;

import institution.KnowledgeSource;
import institution.SourseOfKnowledge;

public class SelfStudy implements KnowledgeSource {
    Student student;
    int factorOfPractice;
    int factorOfTheory;

    public SelfStudy(Student student, int factorOfPractice, int factorOfTheory) {
        this.student = student;
        this.factorOfPractice = factorOfPractice;
        this.factorOfTheory = factorOfTheory;
    }

    public void teach(Student student){
       student.knowledge.levelOfTheory += factorOfTheory*student.learningFactor;
       student.knowledge.levelOfPractice += factorOfPractice*student.learningFactor;
    }
}