package Second;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class LambdaEx01 {
    static void execute(MyFunction myFunction) {
        myFunction.run();
    }

    static MyFunction getMyFunction() {
        MyFunction myFunction = () -> System.out.println("f3.run()");
        return myFunction;
    }

    public static void main(String[] args) {
        MyFunction function01 = () -> System.out.println("f1.run()");

        MyFunction function02 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction function03 = getMyFunction();

        function01.run();
        function02.run();
        function03.run();

        execute(function01);
        execute( () -> System.out.println("run()"));
    }
}
