package akademia.zadania.interfejsy.zadanie1;

public class Main {
    public static void main(String[] args) {
        AppleBox appleBox = () -> System.out.println("AppleBox");
        appleBox.getBox();

        StrawberyBox strawberyBox = new StrawberyBox() {
            @Override
            public void getstart() {
                System.out.println("Get start");
            }

            @Override
            public void getstop() {
                System.out.println("Get stop");
            }
        };
        strawberyBox.getstart();
        strawberyBox.getstop();

        getBoxes();
    }

    public static void getBoxes(){
        AppleBox appleBox = () -> System.out.println("getBoxes -AppleBox");
        appleBox.getBox();

        StrawberyBox strawberyBox = new StrawberyBox() {
            @Override
            public void getstart() {
                System.out.println("getBoxes -Get start");
            }

            @Override
            public void getstop() {
                System.out.println("getBoxes -Get stop");
            }
        };
        strawberyBox.getstart();
        strawberyBox.getstop();
    }
}
