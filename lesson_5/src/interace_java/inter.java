package interace_java;

class Some implements  Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("num -" + i);
    }
}
public class inter {
    public static void main(String[] args) {
        Thread new_one = new Thread(new Some());
        Thread new_two = new Thread(new Some());
        Thread new_three = new Thread(new Some());

        new_one.start();
        new_two.start();
        new_three.start();
    }
}
