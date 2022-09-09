import java.util.Scanner;

public class SuperGreeter {
    //Sige hej til brugrere.
    public void start() {
        System.out.println("Det virker");
    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        System.out.println("Hej bruger!");
        System.out.println("Indstaste dit navn:");

    }

    public String name() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return name;
        public void start() {
            System.out.println("Hej" + name);
        }
    }
}

