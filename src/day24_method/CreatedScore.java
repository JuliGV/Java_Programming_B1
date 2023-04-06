package day24_method;

public class CreatedScore {
    public static int getCreditScore(){
        return 800;
    }

    public static String isGoodCreditHistory(int score){
        if(score>=720 && score <=750){
            return "Greate";
        } else if (score >= 720 && score <= 750){
            return "Good";
        }else{
            return "Poor";
        }

    }

    public static void main(String[] args) {
        getCreditScore();
        System.out.println(getCreditScore());
        System.out.println(getCreditScore() +50);
        System.out.println();
    }



}
