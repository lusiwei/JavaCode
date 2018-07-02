public class Test {
    public static void main(String args[]) {




//跑步
        
        int step = 3000;
        if (step < 1000) {
            System.out.println("今天运动量太少了");
        } else if (step < 3000) {
            System.out.println("今天运动量还不错");
        } else if (step < 6000) {
            System.out.println("你今天应该很累了，跑了"+ step+ "米");
        } else {
            System.out.println("你今天超神了");
        }




    }
}