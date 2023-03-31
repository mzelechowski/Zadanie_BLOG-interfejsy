package akademia.zadania.interfejsy;

public class Box2 {
    public void getText(){
        Apple abc=new Apple(){ // klasa anonimowa

            @Override
            public void getStart() {
                System.out.println("Metoda w klasie anonimowej Start");
            }

            @Override
            public void getStop() {
                System.out.println("Metoda w klasie anonimowej Stop");
            }
        };
    }
}
