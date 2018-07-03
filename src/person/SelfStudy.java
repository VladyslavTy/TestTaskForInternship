package person;

import institution.KnowledgeSource;


public class SelfStudy implements KnowledgeSource {

    int factorOfPractice;
    int factorOfTheory;

    public SelfStudy(int factorOfPractice, int factorOfTheory) {
        this.factorOfPractice = factorOfPractice;
        this.factorOfTheory = factorOfTheory;
    }

    public void teach(Student student){
        teachTheory(student);
        teachPractice(student);
    }

    private void teachTheory(Student student){
        student.learnTheory(factorOfTheory);
    }

    private void teachPractice(Student student){
        student.learnPractice(factorOfPractice);
    }
}