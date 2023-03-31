package akademia.zadania.interfejsy;

public class Box implements Apple{
    @Override
    public void getStart() {
        System.out.println("Start");
    }

    @Override
    public void getStop() {
        System.out.println("Stop");
    }
}
