/**
 * Created by danawacomputer on 2017-04-05.
 */
public class ArrayExample {
    public static void main(String[] args){
        int[] iArr = new int[10];

        for(int idx = 0; idx < iArr.length; idx++){
            iArr[idx] = 2*(idx + 1);
            if(idx == 4) iArr[idx] = 35_000;
            System.out.println("[" +idx + "] = " + iArr[idx]);
        }

        /*
           int[] iArr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for(int e: iArr2){
            if(e%5 == 0) System.out.println("bingo");
            else System.out.println(e);
        }
         */

        int[] iArr2 = {1,2,3,4,5,6,7,8,9,10,
                11,12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30};

        int oneNumber = 0;
        int secondNumber = 0;

        for(int i = 0; i < iArr2.length; i++){

            oneNumber = iArr2[i] - (iArr2[i]/10)*10;
            secondNumber = iArr2[i] / 10;

                if((oneNumber%3 == 0 && oneNumber != 0)|| (secondNumber%3 == 0 && secondNumber != 0)){
                    System.out.println("clap!!");
                }
                else System.out.println(iArr2[i]);
        }

        //accumulate
        int sum = 0;
        int countOfArray = 0;
        double averageOfArray = 0.0;

        for(int e: iArr2){
            sum += e;
        }

        countOfArray = iArr2.length;

        averageOfArray = sum/(double)countOfArray;

        System.out.println("sum: " + sum + ", average: " + averageOfArray);

    }
}
