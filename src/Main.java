import java.util.*;
public class Main {

    static public void guess(String word, int life){

        char[] filler= new char[word.length()];
        int i =0;
        while (i<word.length() ){
            filler[i]='-';
            if(word.charAt(i)==' '){
                filler[i]=' ';
            }
            i++;
        }
        System.out.print(filler);
        System.out.println("     Life remaining=" + life);

        ArrayList<Character> l = new ArrayList<Character>();


        Scanner s=new Scanner(System.in); // leest de characters

        while(life>0){
            char x=s.next().charAt(0); // character input door gebruiker

            if(l.contains(x)){
                System.out.println("al gebruikt");
                continue; //terwile loop bezig is
            }

            l.add(x);

            if(word.contains(x+"")){
                for(int y=0;y<word.length();y++) { //deze loop checkt voor indexes van de letter
                    if(word.charAt(y)==x){         // en zal een '-' er voor in de plaats doen
                      filler[y]=x;                 //het character
                    }
                }
            }
            else{
                life--; //life decreses als het ingevoerde character niet klopt
            }
            if(word.equals(String.valueOf(filler))) { //controleert of de filler heztzelfde is als als word
                System.out.print(filler);
                System.out.println(" you won!!!");
                break;
            }

            System.out.print(filler);
            System.out.println("     Life remaining=" + life);
        }
        if(life==0){
            System.out.println("you loose");
        }


    }



    public static void main (String[] args) {
       System.out.println("dit is galgje\n in dit leuke spelletje ga jij een woord raden\n maar je heb maar een bepaald aantal levens succses");
       //String[] mannetje= {"nog niet dood" ,  "| \n|\n|\n|\n|\n|\n|\n|\n|\n|" , " 1|--------------- \n|/ \n| \n| \n| \n| \n| \n| \n| \n|" ,   "2|--------------- \n|/             |\n|              | \n|            (*_*)\n| \n| \n| \n| \n| \n|" , "3|--------------- \n|/             |\n|              | \n|            (*_*)\n|           \\  |  / \n|            \\ | /\n|              | \n|        \n| \n|" , "4|---------------  \n|/             |  \n|        \\     |    / \n|         \\  (*_*) / \n|          \\   |  /\n|              |\n|              |\n|            /    \\ \n|           /      \\ \n| " , "   __________ \n /            \\ \n|  you dead   |"};
       //System.out.println(mannetje[]);



        String word ="florian tjeertes"; // het woord die geraade word
        int life=5;
        guess(word,life);










    }
}
