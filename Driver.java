public class Driver {

    public static void main(String[] args) {

        //create a ConsoleInput class that implements Input
        //create a ConsoleOutput class that implements Output
        //DO NOT alter the driver or the IOTester classes
        //Your program is working when you receive all success messages
        //The Input and Output interfaces describe what the methods should do
        IOTester tester = new IOTester(new ConsoleInput(), new ConsoleOutput());
        tester.test();

    }

}