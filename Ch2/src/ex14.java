public class ex14 {

    public static void main(String[] args) {
        int result1 = 10 + 2 + 8;
        System.out.println("result1:" + result1);

        String result2 = 10 + 2 + "8"; //String 함수는 ""로 지정하는 것으로 문자열 그대로 뒤로 붙이는 역할을 한다.
        System.out.println("result2:" + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3:" + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4:" + result4);

        String result5 = "10" + (2 + 8);
        System.out.println("result5:" + result5);
    }

}
