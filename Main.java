import java.util.Random;
public class Main
{
    int num = 123456;
    int array[] = new int[100];

    public String reverse()
    {
        String tmp = Integer.toString(this.num);
        return new StringBuilder(tmp).reverse().toString();
    }

    public void fill()
    {
        for(int x = 0; x < array.length; x++)
        {
            Random random = new Random();
            int y = random.nextInt(100);
            array[x] = y;
        }
    }

    public void numbers()
    {
        int avgNum = 0;
        int maxNum = array[0];
        int minNum = array[0];
        for(int x = 0; x < array.length; x++)
        {
            if(array[x] > maxNum)
            {
                maxNum = array[x];
            }
            if(array[x] < minNum)
            {
                minNum = array[x];
            }
            avgNum = avgNum + array[x];
        }
        avgNum = avgNum / 100;
        System.out.println("average number = " + avgNum);
        System.out.println("Maximum number = " + maxNum);
        System.out.println("minimum number = " + minNum);
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.fill();
        main.numbers();
        String str = main.reverse();
        System.out.println(str);
    }
}
