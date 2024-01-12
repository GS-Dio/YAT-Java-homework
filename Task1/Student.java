package Task1;

public class Student {
    private String name;
    private int markMath;
    private int markEnglish;
    private int markProgramming;

    public Student(String name, int markMath, int markEnglish, int markProgramming) {
        this.name = name;
        this.markMath = markMath;
        this.markEnglish = markEnglish;
        this.markProgramming = markProgramming;
    }

    public String getName() {
        return name;
    }
    public int getMarkMath() {
        return markMath;
    }
    public int getMarkEnglish() {
        return markEnglish;
    }
    public int getMarkProgramming() {
        return markProgramming;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarkMath(int markMath) {
        this.markMath = markMath;
    }
    public void setMarkEnglish(int markEnglish) {
        this.markEnglish = markEnglish;
    }
    public void setMarkProgramming(int markProgramming) {
        this.markProgramming = markProgramming;
    }

 public void AboveFour(){
     double averageScore = (double) (markEnglish + markMath + markProgramming) /3;
     if(averageScore >= 4)
     System.out.println(name + " " +  averageScore);
 }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", markMath=" + markMath +
                ", markEnglish=" + markEnglish +
                ", markProgramming=" + markProgramming +
                '}';
    }

    public static void main(String[] args) {
        Student Anderson = new Student("Tomas Anderson",5,5,4);
        Student  White = new Student("Steve White",3,3,4);
        Student Smith = new Student("Anna Smith",4,2,5);
        Student Turley = new Student("Jackson Turley",2,4,3);
        Student Bree = new Student("Katty Bree",3,5,4);

        Anderson.AboveFour();
        White.AboveFour();
        Smith.AboveFour();
        Turley.AboveFour();
        Bree.AboveFour();
    }
}
