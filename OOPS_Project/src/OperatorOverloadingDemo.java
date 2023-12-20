/*
    Author: Perla Reddy

    OperatorOverloadingDemo: will be used for demonstrating about Operator Overloading
 */
public class OperatorOverloadingDemo {

    OperatorOverloadingDemo(){

    }

    //

    public static void main(String[] args) {
        int a = 90;
        int b = 90;

        //int &abc;
        int studentId;
        String firstName;
        String first_name;
        String last_name;


        String name1 = "Siri";
        String name2 = "Dhatrika";

        //Concatination of name1, name2
      //  System.out.println(name1+name2);
        //TICKET: 12: ajdfkd
		/*
		 * System.out.println(name1+name2); System.out.println(name1+name2);
		 */

        //SiriDhatrika afdakfasdfk aksdfasfkdsa kfd aask dsafsdaf

        /*
        Ex: 8+8 = 16 -- addition 
"Siri"+"Dhatrika" = SiriDhatrika //Concatenation
1+1+"Dhatrika"   =
"Dhatrika"+1+1   =
(1+1)+"Dhatrika" =
"Dhatrika"+(1+1) =
"Dhatrika"+(1+1)+"Siri"+23+24=
         */
        System.out.println(a+b);//180
        System.out.println(name1+name2);//SiriDhatrika
        System.out.println(a+b+name1);//180Siri
        System.out.println((a+b)+name1);//180Siri
        System.out.println(name1+a+b);//Siri9090
        System.out.println(name1+(a+b));//Siri180
        System.out.println(name1+(a+b)+name2+a+b);//Siri180Dhatrika9090

    }
}
