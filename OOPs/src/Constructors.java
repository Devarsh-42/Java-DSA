public class Constructors {
    public static void main(String arg[]){
        Student s1 = new Student();
        Student s2 = new Student("Hank");
        Student s3 = new Student(201);
        //Student s4 = new Student("Devarsh",201);// Will Show error bocz no parameters match.
        s1.name = "Devarsh";
        s1.roll = 201;
        s1.password = "123abc";
        //Initial Marks
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

       Student s4 = new Student(s1);// Copying S1 to S4
       s4.password = "xyz";
       //Now we change initial marks,you might think that you will get the marks same as s1 bcoz you-
       //-copied it in prev statement & the changed in s1 but any change in s1(Original Constructor)-
        //-will also be shown in copy constructor

      //THIS IS BCOZ in this.marks = s1.marks; COPIES THE REFERENCE & NOT THE ACTUAL VALUE OF ARRAY

      //THIS IS CALLED SHALLOW COPY:
        s1.marks[2] = 70;
       for(int i=0; i<3; i++){
           System.out.println(s4.marks[i]);
       }
    }
    static class Student {
        String name;
        int roll;
        String password;
        int marks[];

        //DEEP COPY CONSTRUCTOR:
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0; i<marks.length; i++){
                this.marks[i] = s1.marks[i];//We are copying the O/L value & storing them in a new
                // memory location. not reflecting the O/L values.
            }
        }
        Student() {//NON PARAMETERIZED CONSTRUCTOR

            System.out.println("You can print this....");
            marks = new int[3];
        }
        Student(String name){//PARAMETERISED CONSTRUCTOR

            this.name = name;
            marks = new int[3];
        }
        Student(int roll){

            this.roll = roll;
            marks = new int[3];
        }
//        Student( Student s1){// SHALLOW COPY CONSTRUCTOR--> Copied the properties of s1 to s4
//            this.name = s1.name;
//            this.roll = s1.roll;
//            marks = new int[3];
//            this.marks = s1.marks;
//        }
    }
}
