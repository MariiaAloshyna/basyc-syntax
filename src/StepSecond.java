public class StepSecond {
    public static void main(String[] args) {
        float sideA = 3.0f;
        float sideB = 4.0f;
        float sideC = 5.0f;

        float p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

        System.out.println("Triangle's area is: " + area);


        //Increment-decrement
        int x = 10;

        System.out.println("Initial value of x: " + x);

        System.out.println("pre-increment operation result is " + (++x) +" ; and after pre-increment x = " + x);

        System.out.println("post-increment operation result is " + (x++) +" ; and after post-increment x = " + x);

        System.out.println("pre-decrement operation result is " + (--x) +" ; and after pre-decrement x = " + x);

        System.out.println("post-decrement operation result is " + (x--) +" ; and after post-dedcrement x = " + x);

    }
}
