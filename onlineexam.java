
import java.util.Scanner;

public class onlineexam{
    public static void main(String[] args) {
        String username;
        String  Password;
        int ch=4;
        int choice;
        int count=0;
        Scanner reader=new Scanner(System.in);
        System.out.println("enter the user name:");
        username=reader.nextLine();
        System.out.println("enter the password :");
        Password=reader.nextLine();
        if(username.equals("shan")&& Password.equals("1234")){
            System.out.println("welcome shahnawaz to online quiz contest");
        }
        else{
            System.out.println("user name and password is incorrect try again");
        }
        do {
            System.out.println("1.enter the quiz contest\n");
            System.out.println("2.view the marks\n");
            System.out.println("3.exit\n");
            System.out.println("enter your choice:");
            ch=reader.nextInt();
            if(ch == 4){
                System.out.println("thanku for taking exam");
                break;
            }
            switch(ch){
                case 1:{
                    System.out.println("select prograaming language");
                    System.out.println("1.c \n2.java\n3.c++");
                    System.out.println("choose one sunject");
                    int sub=reader.nextInt();
                    System.out.println("there are five question in java");

                    count=0;
                    if(sub==2){
                        System.out.println("Q.1.Java is developed by:");
                        System.out.println("1.James Gosling \n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.println("choose option");
                        choice=reader.nextInt();
                        if(choice==1){count++;}
                        System.out.println("Q.2.Java is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.Java is:");
                        System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.4.Technical Name of Core Java is knon as:");
                        System.out.println("1.JSE\n2.JEE\n3.J2SE\n4.J2EE");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.Java is:");
                        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();

                        if(choice==3)
                        {
                            ++count;
                        }}
                    else if(sub==1){

                        count=0;
                        System.out.println("Q.1.C is developed by:");

                        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.C is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.C is:");
                        System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.4. C is:");
                        System.out.println("1.Object Oriented\n2.Procedure Oriented\n3.Strictly Object Orieneted\n4.None");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.C is:");
                        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }}
                    else
                    {
                        count=0;
                        System.out.println("Q.1.C++ is developed by:");

                        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.C++ is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.C++ is:");
                        System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.4. C++ is:");
                        System.out.println("1.Object Oriented\n2.Procedure Oriented\n3.Strictly Object Orieneted\n4.None");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.C++ is:");
                        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                        System.out.print("Enter answer:");
                        choice=reader.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                    }

                    break;
                }
                case 2:{
                    System.out.print("Congrats  "+username+"  You scored "+count+    "marks"+"out of 5");
                }
                case 3:{
                    System.out.print("exit");

                }
            }


        }while(true);
    }

}
