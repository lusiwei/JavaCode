public class YunSuanFu {
    public static void main(String args[]) {
//  自增前缀和自增后缀
        int a = 1;
        int b = a++;
        int c = 2;
        int d = ++c;
        System.out.println("自增后缀运算后结果为" + b);
        System.out.println("自增前缀运算后结果为" + d);
        System.out.println("a的值为" + a);
        System.out.println("c的值为" + c);


// 关系运算符，位运算符
        int b1 = 5;
        int b2 = 5 / 2;
        int b3 = 5 % 2;
        System.out.println("b2的值为" + b2 + "\n" + "b3的值为" + b3);


        int c1 = 60;
        int c2 = 13;
        if (c1 == c2) {
            System.out.println("c1和c2相等");
        } else {
            System.out.println("c1和c2不相等");
        }

        int c3 = c1 & c2;
        System.out.println("c1&c2=" + c3);
        int c4 = c1 | c2;
        System.out.println("c1|c2=" + c4);
        int c5 = c1 ^ c2;
        System.out.println("c1^c2=" + c5);
        int c6 = c1<<2;
        System.out.println("c1<<c2=" + c6);
        int c7 = c1 >>> 2;
        System.out.println("c1>>>c2=" + c7);
        int c8= ~c1;
        System.out.println("~c1="+c8);


    }
}