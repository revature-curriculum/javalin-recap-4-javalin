package objects;

public class Exam {

  String name;
  int grade;

  public Exam(String name, int grade){
    this.name = name;
    this.grade = grade;
  }

  public String getName(){
    return name;
  }

  public int getGrade(){
    return grade;
  }

}