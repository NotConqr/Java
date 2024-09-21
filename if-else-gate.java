import java.util.Random;

public class StartClass {

    public static void main(String[] args) {
        int maxnum = 1000;
        Random random = new Random();
        int j = random.nextInt(maxnum);
        int norm = 700;

        if (j == norm) {
          System.out.println("j is "+norm);
        } else if (j > norm) {
          System.out.println("j is more than "+norm+" it is "+j);
        } else if (j < norm){
          System.out.println("j is less than "+norm+" it is "+j);
        } else if (j == maxnum) {
          System.out.println("j is excactly at "+maxnum+" it is max number");
        }

    }
}
