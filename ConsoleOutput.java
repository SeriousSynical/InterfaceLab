public class ConsoleOutput implements Output {

    @Override
    public void out(String out) {

        System.out.println(out);

    }

    @Override
    public void outNl(String out) {

        System.out.println(out);

    }

    @Override
    public void divider() {

        System.out.println("-----------------------------------------------------------------");

    }

}