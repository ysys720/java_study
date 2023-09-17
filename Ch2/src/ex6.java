public class ex6 {

    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20;
        //long var3 = 10000000000;//long타입에서 큰 숫자로 넘어가면 숫자 뒤에 L을 붙여야 컴파일러 오류를 피할 수 있다.
        long var4 = 10000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }

}
