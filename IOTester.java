public class IOTester {

    private Input in;
    private Output out;

    public IOTester(Input input, Output output) {

        in = input;
        out = output;

    }

    public void test() {

        out.divider();
        out.outNl("Please enter a command");
        String command = in.getCommand();
        if(command != null) out.outNl("getCommand - no parameters - success!");
        else out.outNl("getCommand - no parameters - fail");
        out.divider();

        command = in.getCommand("Please type OK");
        if(command != null) out.outNl("getCommand - prompt - success!");
        else out.outNl("getCommand - prompt - user or method failure");
        out.divider();

        out.outNl("Please enter North, South, East, or West");
        command = in.getCommand("Enter North, South, East, or West", new String[]{"North", "South", "East", "West"});
        if(command.equals("North") || command.equals("South") || command.equals("East") || command.equals("West")) {

            out.outNl("getCommand - prompt + allowable - success");

        } else {

            out.outNl("getCommand - prompt + allowable - failure");

        }

        out.divider();

        out.outNl("Please enter an integer");
        int integer = in.getInteger();
        out.outNl("getInteger - Got " + integer);
        out.divider();

        out.outNl("Please enter an integer between 1 and 5");
        integer = in.getInteger(0, 5);
        if(integer >= 0 && integer <=5) {

            out.outNl("getInteger between 1 and 5 - success");

        } else {

            out.outNl("getInteger between 1 and 5 - failure");

        }
        out.divider();

        out.outNl("Please enter a double");
        double number = in.getDouble();
        out.outNl("getDouble - Got " + number);
        out.divider();

        out.outNl("Please enter a double between 1 and 5");
        number = in.getDouble(0.0, 5.0);
        if(number >= 0.0 && number <= 5.0) {

            out.outNl("getDouble between 0.0 and 5.0 - success!");

        } else {

            out.outNl("getDouble between 0.0 and 5.0 - failure");

        }
        out.divider();

    }

}