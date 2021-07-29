public class Scores {
    int[] scores={10,20,30,40};

    public static void main(String[] args) {
        Scores scores= new Scores();
        scores.findScore(2, scores.scores);
    }
    public void findScore(int index,int[] scores){
        try{
            System.out.println(scores[index]);
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}
