interface Interface1 {
    void method1();
    void method2();
}

interface Interface2 {
    void method3();
    void method4();
}

interface Interface3 {
    void method5();
    void method6();
}

interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void method7();
}

class ImplementationClass implements CombinedInterface {

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method4() {
        System.out.println("Method 4");
    }

    @Override
    public void method5() {
        System.out.println("Method 5");
    }

    @Override
    public void method6() {
        System.out.println("Method 6");
    }

    @Override
    public void method7() {
        System.out.println("Method 7");
    }
}

public class MultipleInterfacesTest {
    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
    }
}
