public class Statickeyword {
    public static void main(String arg[]){
        Students s1 = new Students();
        s1.SchoolName = "St.Xavier's";
        System.out.println(s1.SchoolName);

        Students s2 = new Students();
        System.out.println(s2.SchoolName);//-->We didn't define SchoolName for s2 but we still got the-
        //-output bcoz its static.
        s2.name = "Bruce";
        System.out.print(s2.name+"\t");
        System.out.print(s2.Surname);
    }
    static class Parents{
        static String Surname;
    }
    static class Students extends Parents{
        String name;
        int roll;
        int marks;
        static String SchoolName;

        Students(){
            super.Surname = "Wayne";//super.property allows to use the mention property/function of-
            //-Parent class (Coincidentally here too parent class).

        }

        void name(String name){//Getters
            this.name = name;
        }
        String name(){//Setters
            return this.name;
        }
    }
}
