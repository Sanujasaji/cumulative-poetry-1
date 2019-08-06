package cumulative.poetry;

public class Poet {
    static String[] day = {
            "the horse and the hound and the horn that belonged to",
            "the farmer sowing his corn that kept",
            "the rooster that crowed in the morn that woke",
            "the priest all shaven and shorn that married",
            "the man all tattered and torn that kissed",
            "the maiden all forlorn that milked",
            "that cow with the crumpled horn that tossed",
            "the dog that worried",
            "the cat that killed",
            "the rat that ate",
            "the malth that lay in",
            "the house that Jack built."
    };



    public static void main(String args[]){

        String option1  =  args[0];
        StringBuilder poem = new StringBuilder();
        int for_which_day = 0;
        if(option1.equals("reveal-for-day")){
            for_which_day = Integer.parseInt(args[1]);
            poem.append(reveal_up_till(for_which_day ));
        }else{
            for(int i =1;i<=12;i++){
                poem.append("Day "+ i + "\n");
                poem.append(reveal_up_till(i));
            }
        }

        System.out.println(poem.toString());
    }


    public  static  String reveal_up_till(int length){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = day.length -length ;i < day.length;i++){
            stringBuilder.append(day[i]);
            stringBuilder.append("\n");
        }
        return "This is " + stringBuilder.toString();


    }
}
