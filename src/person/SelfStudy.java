package person;

import institution.KnowledgeSource;


public class SelfStudy implements KnowledgeSource {

    public void teach(Student student){
        teachTheory(student);
        teachPractice(student);
    }

    private void teachTheory(Student student){
        student.learnTheory(student.knowledge.levelOfTheory);
    }

    private void teachPractice(Student student){
        student.learnPractice(student.knowledge.levelOfPractice);
    }
}