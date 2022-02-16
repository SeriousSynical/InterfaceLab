public interface Input {

    public String getCommand(); // DONE: gets a string command from the user
    public String getCommand(String prompt); // DONE: prompts the user and gets a string
    public String getCommand(String prompt, String[] allowableValue); // DONE: prompts the user and ensures that only values in the allowable array are accepted
    public int getInteger(); // gets an integer from the user
    public int getInteger(int lowerBound, int upperBound); // gets an integer from the user withing the selected range
    public double getDouble(); // gets a double from the user
    public double getDouble(double lowerBound, double upperBound); // gets a double within the selected range

}