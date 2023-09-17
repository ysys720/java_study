public class ex13 {

    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println("result1:" + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2:" + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println("result3:" + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4:" + (char) result4);

        int v8 = 10;
        int result5 = v8 / 4;
        System.out.println("result5:" + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;
        System.out.println("result6:" + result6);

        double v10 = 1;
        double v11 = 2;
        double result7 = v10 / v11;
        System.out.println("result7:" + result7);
        /**
         * int v10 = 1;
         * int v11 = 2;
         * double result7 = (double)v10 / v11;
         * System.out.println("result7" + result7);
         * 값을 int로 지정했을 경우 result 값을 지정할때 소수점을 보고 싶다면 double result = (double) 함수로 표현 될 수 있도록 한다.
         */
    }

}
