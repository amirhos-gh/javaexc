package entities;
import java.util.*;
class School{
    private String name;
    private int numOfStudent;
    private boolean housed;
    private ArrayList<String> houseNames;
    private Vector<String> studentNames[];
    private Vector<String> professorNames[];
    private ArrayList<String> courseNames;
    School() {
        houseNames = new ArrayList<String>();
        studentNames = (Vector<String>[])new Vector[30];
        professorNames = (Vector<String>[])new Vector[30];
        courseNames = new ArrayList<String>();      
    }
    void getname(String name){
        this.name = name;
    }
    String setname(){
        return name;
    }
    void getnumOfStudent(int numOfStudent){
        this.numOfStudent = numOfStudent;
    }
    int setnumOfStudent(){
        return numOfStudent;
    }
    void gethoused(boolean housed){
        this.housed = housed;
    }
    boolean sethoused(){
        return housed;
    }    
    void gethouseNames(ArrayList<String> houseNames){
        this.houseNames = houseNames;
    }
    ArrayList<String> sethouseNames(){
        return houseNames;
    }    
    void getstudentNames(Vector<String>[] studentNames){
        this.studentNames = studentNames;
    }
    Vector<String>[] setstudentNames(){
        return studentNames;
    }       
    void getprofessorNames(Vector<String>[] professorNames){
        this.professorNames = professorNames;
    }
    Vector<String>[] setprofessorNames(){
        return professorNames;
    }         
    void getcourseNames(ArrayList<String> courseNames){
        this.courseNames = courseNames;
    }
    ArrayList<String> setcourseNames(){
        return courseNames;
    }    
}
class Course{
    private String name;
    private char minGrade;
    private String professorName;
    private int year;
    private Vector<String> studentNames[];
    Course(){
        studentNames = (Vector<String>[])new Vector[30];
    }
    void getname(String name){
        this.name = name;
    }
    String setname(){
        return name;
    }      
    void getminGrade(char minGrade){
        this.minGrade = minGrade;
    }
    char setminGrade(){
        return minGrade;
    }        
    void getprofessorName(String professorName){
        this.professorName = professorName;
    }
    String setprofessorName(){
        return professorName;
    }     
    void getyear(int year){
        this.year = year;
    }
    int setyear(){
        return year;
    }          
    void getstudentNames(Vector<String>[] studentNames){
        this.studentNames = studentNames;
    }
    Vector<String>[] setstudentNames(){
        return studentNames;
    }     
}
class Person{
    private String name,houseName,bloodStatus,school;
    private Date birthday;
    Person(){
        birthday = new Date();
    }
    void getname(String name){
        this.name = name;
    }
    String setname(){
        return name;
    }     
        void gethouseName(String houseName){
        this.houseName = houseName;
    }
    String sethouseName(){
        return houseName;
    }   
        void getbloodStatus(String bloodStatus){
        this.bloodStatus = bloodStatus;
    }
    String setbloodStatus(){
        return bloodStatus;
    }   
    void getschool(String school){
        this.school = school;
    }
    String setschool(){
        return school;
    }   
    void getbirthday(Date birthday){
        this.birthday = birthday;
    }
    Date setbirthday(){
        return birthday;
    }
}
public class entities{
    
    public static void main(String[] args) {
        
    }
    
}
