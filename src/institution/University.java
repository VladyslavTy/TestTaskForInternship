package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;

public class University implements KnowledgeSource{
    String universityName;
    Student student;
    int factorOfPractice;
    int factorOfTheory;

    public ArrayList<Student> students = new ArrayList<>();

    public University(String name, int factorOfPractice, int factorOfTheory) {
        this.universityName = name;
        this.factorOfPractice = factorOfPractice;
        this.factorOfTheory = factorOfTheory;
    }

    public void setStudent(Student student) {
        this.student = student;

    }

    public void addStudent(Student student, Knowledge knowledge) {
        student.setKnowledge(knowledge);
        students.add(student);
    }


    public void teach(Student student){
        if(studentCheck(student)){
            student.learn(factorOfTheory,factorOfPractice);
        }

    }

    private boolean studentCheck(Student persone){
        for (Student student: students
             ) {
            if(persone == student){
                return true;
            }
        }
        return false;
    }
}
