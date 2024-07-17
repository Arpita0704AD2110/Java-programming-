import java.util.Scanner;
public class chaldean_number {
    int i, num;
    int sum = 0;
    String str = "";
    int sof;

    @SuppressWarnings("resource")
    public void get_detail()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name to find the number from your name :- ");
        str= sc.nextLine();
    }
    public void detail() {

        for (i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A' || c == 'I' || c == 'J' || c == 'Q' || c == 'Y' || c == 'a' || c == 'i' || c == 'j' || c == 'q' || c == 'y') 
            {
                num = 1;
            } 
            else if (c == 'B' || c == 'K' || c == 'R' || c == 'b' || c == 'k' || c == 'r') 
            {
                num = 2;
            } 
            else if (c == 'C' || c == 'G' || c == 'L' || c == 'S' || c == 'c' || c == 'g' || c == 'l' || c == 's') 
            {
                num = 3;
            } 
            else if (c == 'D' || c == 'M' || c == 'T' || c == 'd' || c == 'm' || c == 't') 
            {
                num = 4;
            } 
            else if (c == 'E' || c == 'H' || c == 'N' || c == 'X' || c == 'e' || c == 'h' || c == 'n' || c == 'x') 
            {
                num = 5;
            } 
            else if (c == 'U' || c == 'V' || c == 'W' || c == 'u' || c == 'v' || c == 'w') 
            {
                num = 6;
            } 
            else if (c == 'O' || c == 'Z' || c == 'o' || c == 'z') 
            {
                num = 7;
            } 
            else if (c == 'F' || c == 'P' || c == 'f' || c == 'p') 
            {
                num = 8;
            } 
            else {
                num = 0;
            } 
            sum = sum + num;
        }
       
    }
    public void sum()
    {
        sof=0;
        while(sum>0)
        {
        int temp = sum%10;
        sof = sof+temp;
        sum=sum/10;
        }
        System.out.println("The name number of "+ str + " as per chaldean numerology is " + sof);

    }
    
    public void get()
    {
         if(sof == 1)
         {
            System.out.println("A number to look after the actual skills and potential as people have not explored them ye");
            System.out.println("As per the readings, this number possesses a distinctive manner to handle problems. Also, natives whose name number ends up as 1 are utterly good at the beginning and implementing new projects. They are self-centered and hold demanding tendencies. They have ego issues as well, which feed this as their negative traits. But on the other hand, they are natural leaders and follow the path of righteousness.");
         }
         if(sof == 2)
         {
            System.out.println("It is the number that makes the person commanding and self-reliant.");
            System.out.println("According to the readings, people with the number 2 are considered peacemakers. These people possess all the qualities of an empathetic person. They have a sensitive and overprotective nature. Usually, these people are seen as shy beings. However, on the other hand, they are full of grace and confidence. They don’t like confronting people, which makes up for their negative traits. But, their positive qualities involve care and concern for partnership and friend-like qualities.");
         }
         if(sof == 3)
         {
            System.out.println("This number is for compatibility and adaptability.");
            System.out.println("As per the readings, this number is all about optimism and creativity. So, the folks who possess this Chaldean numerology number love to live their life on their own terms and have a charismatic aura. They are mindful people, and as their positive qualities, they are effortless and extremely generous. However, as their negative trait, they are highly giving people, which makes them folks who are easily manipulated.");
         }
         if(sof == 4)
         {
            System.out.println("It is for depicting creativity and challenges.");
            System.out.println("According to the readings, this number of people are highly organized people. They are highly hardworking and determined. Thus, they possess a practical personality. Natives with this numerology number hold the capability to face challenges and the strength to manage things accordingly. However, as their negative trait, these people feel fear and lack self-confidence.");
         }
         if(sof == 5)
         {
            System.out.println("It is to explore and love freedom creatively.");
            System.out.println("As per the readings, these people are free spirits. They value freedom and focus on adventurous activities that constantly feel them alive. Moreover, people who have Chaldean number 5 constantly build their lives to perform better and attain stability. As a positive trait, they love to explain everything in detail and work thoroughly to attain perfection. Also, they hold great passion and motivation to perform their tasks in the best way possible. However, as their negative trait, they get irritated too early in all situations.");
         }
         if(sof == 6)
         {
            System.out.println("It represents order and discipline.");
            System.out.println("According to the readings, people with this number are caring and giving. They love to focus on their personal lives and give great importance to parenting and nurturing. These natives understand people way better and are highly reliable as a company. They possess accountability and love to make others' world better. As their positive traits, they are exceptionally great professionals. However, on the negative side, they focus more on others than themselves.");
         }
         if(sof == 7)
         {
            System.out.println("This number signifies a person who stays busy in vital matters and is involved in learning.");
            System.out.println("As per the readings, these people are somewhat similar to philosophers. These natives are critical and analytical thinkers and love to play vital roles as advisors. In the list of positive traits, these people are wise and possess perfectionism and knowledge. Also, they love to grasp knowledge as much as possible. However, on the other hand, they are introverted and stay quiet, which makes them less expressive and odd people by nature.");
         }
         if( sof == 8)
         {
            System.out.println("This one illustrates someone who is deferential and smart.");
            System.out.println("According to the readings, these people are professionally drifting. They follow the path of knowledge and practicality. They are goal-oriented beings and hold qualities like ambitiousness and focus. They make great leaders and love to take initiative in life. As their positive traits, this number of people motivate everyone around them. Also, they believe in keeping a broad vision and great organization skills. However, on the other hand, this workaholic nature makes them neglect everything else in life. In fact, sometimes, they behave as exceedingly mean and attitude-giving people.");
         }
         else if(sof == 9)
         {
            System.out.println("It depicts ambitions, determination, and money-minded nature along with resolutions.");
            System.out.println("As per the readings, natives with this number are genuine in nature. They possess a global outlook and compassionate nature. These people love to do extraordinary tasks and focus on things that make them practical and highly determined beings. In the list of their positive traits, they are highly selfless and thoughtful. Also, they hold a very generous nature, which makes them caring and friendly people. But as their negative trait, they attach too deeply to everyone. Thus, they overthink and over-attach to people.");
         }
         else 
         {
            System.out.println("No number");
         }
    }
    public void no_need()
    {
        System.out.println("Okay! don't worry.");
        System.out.println("Stay cool and happy!");
    }
    @SuppressWarnings("resource")
    public void explain()
    {
        String ans;
        Scanner sc= new Scanner(System.in);
        System.out.println("If you want to get the meaning of the your number :-");
        System.out.print("Please type yes/no :- ");
        ans = sc.nextLine();
        
        switch(ans)
        {
            case "yes":
            System.out.println("Here is your answer :- ");
                get();
                break;
            case "no":
                no_need();
                break;
            default :
                System.out.println("Please enter again :-");
                
        }
    }

    public static void main(String args[]) {
        chaldean_number ch = new chaldean_number();
        ch.get_detail();
        ch.detail();
        ch.sum();
        ch.explain();


    }
}
