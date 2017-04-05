import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class ProductPrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double cigarettePrice = 0;
        int cigaretteType = 0;
        boolean wrongInput = false;



        do{
            wrongInput = true;
            System.out.println("1. 담배 종료를 입력하세요(1. 디스, 2. 말보루)");
            cigaretteType = scanner.nextInt();
            if(wrongInput) System.out.println("숫자 1과 2중에 입력하세요.");


        }while(cigaretteType != 1 && cigaretteType != 2);
        wrongInput = false;

        System.out.println("2. 나이를 입력하세요:");
        int age = scanner.nextInt();

        System.out.println("3. 수량을 입력하세요:");
        int cigaretteCount = scanner.nextInt();

        switch (cigaretteType){
            case 1:
                cigarettePrice = 4_500;
                break;
            case 2:
                cigarettePrice = 5_200;
                break;
            default:
        }

        if(age < 19){
            cigarettePrice -= cigarettePrice * 0.2;
            System.out.println("19세 미만 20% discount 들어갔어요");
        }
        else if(age >= 45){
            cigarettePrice += cigarettePrice * 0.3;
            System.out.println("45세 이상 30% 추가 부과되었어요");
        }
        else{
        }

        double totalCigarettePrice = cigarettePrice * cigaretteCount;
//        System.out.println("total cigarette price:" + totalCigarettePrice);
        System.out.printf("total cigarette price: %,.1f", totalCigarettePrice);

   }
}
