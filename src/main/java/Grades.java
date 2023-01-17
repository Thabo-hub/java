package main.java;

public class Grades {
    public String subject;
    public int marks;

    public int checkSubject(String subject){
        String [] subjects = {"English","Maths","Science"};
        this.subject = subject;
        int subjectFound = 0;

        for(String i: subjects){
            if(this.subject == i){
               subjectFound += 1;
            }
        }
        return subjectFound;
    }

    public String checkMarks(String subject, int mark){
        int isSubjectFound = this.checkSubject(subject);
        String result = "waiting";

        if(isSubjectFound == 0){
            System.out.println("Sorry the Subject you just Entered is not correct!");
        }else{
            if(mark < 50){
                result =  "F";
            }else if(mark > 50 && mark < 70){
                result =  "D";
            }else if(mark < 70){
                result = "A";
            }
        }

        return result;
    }
}
