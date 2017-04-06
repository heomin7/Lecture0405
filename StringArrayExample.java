/**
 * Created by danawacomputer on 2017-04-05.
 */
public class StringArrayExample {
            public static void main(String[] args){

        //1. 각 엘레먼트의 글자 수의 평균 구하기

        //2. 글자수가 3글자 이하인 엘레먼트의 배열을 만드세요.

        String[] strArr = {"숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "황제해물보쌈",
                "은행골", "메이비", "돌배기집", "구로곱창", "두끼", "아비꼬", "호우양꼬치",
                "마루가메제면", "킹콩부대찌개", "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱"};

        int lengthSum = 0;
        double lengthAverage = 0;

        for(int idx = 0; idx < strArr.length; idx++){
            lengthSum += strArr[idx].length();
        }

        lengthAverage = lengthSum / (double)strArr.length;

        System.out.println("Array length average: " + lengthAverage);

        String[] str3UnderArray = new String[strArr.length];
        int arr3UnderCount = 0;
/*
        for(int idx = 0; idx < strArr.length; idx++){
            strArr[idx] = strArr[idx].replace(" ", "");

            if(strArr[idx].length() <= 3) {
                str3UnderArray[arr3UnderCount++] = strArr[idx];
            }
        }
 */
        int arr3Undercount = 0;
        for(String e: strArr){
            e = e.replace(" ", "");
            if(e.length() <= 3){
                str3UnderArray[arr3Undercount++] = e;
            }
        }


        for(int idx = 0; idx < arr3Undercount; idx++){
            System.out.println("[" + idx + "] = " + str3UnderArray[idx]);
        }
    }
}
