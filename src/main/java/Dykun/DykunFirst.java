package Dykun;

public class DykunFirst {
    public void test(){
        testPrivate(50);
    }

    private void testPrivate (int x){
        if (x>100) {
            System.out.println("Hello Dykun");
        } else System.out.println("Hello Manko");
    }
}
