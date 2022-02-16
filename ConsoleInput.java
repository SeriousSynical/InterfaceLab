import java.util.Scanner;

public class ConsoleInput implements Input {

    Scanner keyboard = new Scanner(System.in);

    @Override
    public String getCommand() {

        return keyboard.nextLine();

    }

    @Override
    public String getCommand(String prompt) {

        System.out.println(prompt);
        return keyboard.nextLine();

    }

    @Override
    public String getCommand(String prompt, String[] allowableValue) {

        boolean isSame = false;
        String command;

        do {

            System.out.println(prompt);
            command = keyboard.nextLine();
            for (String string : allowableValue) {

                if (command.equals(string)) {

                    isSame = true;

                }

            }

            if (!isSame) {

                System.out.println("Unacceptable input. Try again.");

            }

        } while (!isSame);

        return command;

    }

    @Override
    public int getInteger() {
        
        boolean flag = true;
        int i = 0;
        
        do {
            
            try {

                i = keyboard.nextInt();
                keyboard.nextLine();
                flag = false;
                
            } catch (Exception e) {

                System.out.println("Invalid input. Try again.");
                keyboard.nextLine();

            }
            
        } while (flag);
        
        return i;
        
    }

    @Override
    public int getInteger(int lowerBound, int upperBound) {

        boolean flag = true;
        int i = 0;

        do {

            try {

                i = keyboard.nextInt();
                keyboard.nextLine();
                if (lowerBound <= i && i <= upperBound) {

                    flag = false;

                } else {

                    System.out.println("Input out of bounds. Try again.");

                }

            } catch (Exception e) {

                System.out.println("Invalid input. Try again.");
                keyboard.nextLine();

            }

        } while (flag);

        return i;

    }

    @Override
    public double getDouble() {

        boolean flag = true;
        double d = 0;

        do {

            try {

                d = keyboard.nextDouble();
                keyboard.nextLine();
                flag = false;

            } catch (Exception e) {

                System.out.println("Invalid input. Try again.");
                keyboard.nextLine();

            }

        } while (flag);

        return d;

    }

    @Override
    public double getDouble(double lowerBound, double upperBound) {

        boolean flag = true;
        double d = 0;

        do {

            try {

                d = keyboard.nextDouble();
                keyboard.nextLine();
                if (lowerBound <= d && d <= upperBound) {

                    flag = false;

                } else {

                    System.out.println("Input out of bounds. Try again.");

                }

            } catch (Exception e) {

                System.out.println("Invalid input. Try again.");
                keyboard.nextLine();

            }

        } while (flag);

        return d;

    }

}