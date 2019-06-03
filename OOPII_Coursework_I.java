package oopii_coursework_i;

public class OOPII_Coursework_I {

    
    public static void main(String[] args) {
        System.out.print("Input Student name: ");
        String r = new java.util.Scanner(System.in).next();
        int[] e = new int[6];
        e[0] = 0;
        System.out.println("Input Six CourseUnits: ");
        String a = new java.util.Scanner(System.in).next();
        String g = new java.util.Scanner(System.in).next();
        String n = new java.util.Scanner(System.in).next();
        String x = new java.util.Scanner(System.in).next();
        String y = new java.util.Scanner(System.in).next();
        String z = new java.util.Scanner(System.in).next();
        System.out.println("Input "+a+" mark: ");
        e[0] = new java.util.Scanner(System.in).nextInt();
        System.out.println("Input "+g+" mark: ");
        e[1] = new java.util.Scanner(System.in).nextInt();
        System.out.println("Input "+n+" mark: ");
        e[2] = new java.util.Scanner(System.in).nextInt();
        System.out.println("Input "+x+" mark: ");
        e[3] = new java.util.Scanner(System.in).nextInt();
        System.out.println("Input "+y+" mark: ");
        e[4] = new java.util.Scanner(System.in).nextInt();
        System.out.println("Input "+z+" mark: ");
        e[5] = new java.util.Scanner(System.in).nextInt();
        int average = ((e[0]+e[1]+e[2]+e[3]+e[4]+e[5])*100)/600;
        System.out.println(r+"'s average is: "+average+"%");
        int GPA = (average*5)/100;
        System.out.println(r+"'s GPA is: "+GPA);
        switch(GPA){
            case 0:
                System.out.println(r+"'s grade is: F");
                 break;
            case 1:
                System.out.println(r+"'s grade is: D");
                 break;
            case 2:
                System.out.println(r+"'s grade is: C");
                 break;
            case 3:
            case 4:    
                System.out.println(r+"'s grade is: B");
                 break;
            case 5:
                System.out.println(r+"'s grade is: A");
                 break;     
        }
    }
    
}
