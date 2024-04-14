package Collection2.studentEx;

import java.util.List;

public class University {

    List<Student> students;

    public University(List<Student> students) {
        this.students = students;
    }

    public void expulsionsofCstudents(){
        for(Student student: students){
            if (student.getAverageRating() <= 3){
                students.remove(student);
            } else  {
                student.setCourse(3);
            }
        }
    }

    public void printStudents(List<Student> students, int course){
        for(Student student: students){
           if(student.getCourse() == course){
               System.out.println("|" + student.getName() + course + "|");
           }
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


}
