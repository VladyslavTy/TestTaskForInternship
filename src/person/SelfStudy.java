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
       student.knowledge.levelOfTheory += factorOfTheory*student.learningFactor;
       student.knowledge.levelOfPractice += factorOfPractice*student.learningFactor;
    }
}