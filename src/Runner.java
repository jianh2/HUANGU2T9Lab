public class Runner {
    public static void main(String args[]) {
        Circle circle = new Circle(5);
        System.out.println(circle.getInfo());
        circle.setRadius(9.8);
        System.out.println(circle.getInfo());

        System.out.println("Your lucky number is " + Math.random());
        System.out.println(Math.sqrt(Math.random()));
        System.out.println(Math.sin(90.5));
        String state = "Mississippi is a southern state";
        int a = state.substring(state.indexOf("p")).indexOf(state.substring(state.indexOf("i"),3));
        System.out.print(a);
        double randomNum2 = Math.random() * 75 + 25;
        for (int i = 0; i < 100; i++) {
            int randomNum = (int)(Math.random()*36)+50;

        }

    }

    public static void test2(String args[]) {
        Circle circle = new Circle(532.43);
        System.out.println(circle.getInfo());
        circle.setRadius(3.6);
        System.out.println(circle.getInfo());
    }

    public static void RightTriangle(String args[])
    {
        RightTriangle triangle = new RightTriangle(3,4);
        RightTriangle triangle2 = new RightTriangle(6.5,10.7);
        double hypotenuse = triangle.hypotenuse();
        double hypotenuse2 = triangle2.hypotenuse();

        System.out.println(hypotenuse + "\n" + hypotenuse2);


    }
    public static void RightTriangle3(String args[])
    {
        RightTriangle triangle = new RightTriangle(2313,4213);

        double hypotenuse = triangle.hypotenuse();


        System.out.println(hypotenuse);


    }


}
