import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total no of subjects:");
        int noofSubjects=sc.nextInt();

        int totalMarks=0;
        for(int i=1;i<=noofSubjects;i++){
            System.out.println("Enter marks for Subject:"+i);
            int marks=sc.nextInt();
            totalMarks+=marks;
        }
                
        double averagePercentage=(double)totalMarks/(noofSubjects*100)*100;

        char grade;
        if(averagePercentage>=90){
            grade='A';
        }
        else if(averagePercentage>=80 && averagePercentage<90){
            grade='B';
        }
        else if(averagePercentage>=70){
            grade='C';

        }
        else if(averagePercentage>=60){
            grade='D';
        }
        else{
            grade='F';
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+averagePercentage);
        System.out.println("Grade:"+grade);
        sc.close();
    }
}