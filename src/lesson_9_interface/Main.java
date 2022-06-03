package lesson_9_interface;

public class Main {
    public static void main(String[] args) {

        Animal pes = new Animal();
        pes.name = "Dog";
        pes.setMessage("Hello I'm Dog");
        pes.scream();
        System.out.println();
        pes.setMessage("Gav,gav,gav");

        Amphibian frog = new Amphibian();
        frog.year = 10;
        frog.setMessage("hello I'm Frog");
        frog.scream();

        MakeArrOne arrOne=new MakeArrOne();
        arrOne.length =10;

        MakeArrTwo arrTwo= new MakeArrTwo();

        test(arrOne);
        //Hello im new change
        Quadrat square=new Quadrat();
        System.out.println("The area of the square is equal to "+square.square(10, 10));
    }

    public static void test (InterfaceNew arg) {
        arg.Get();
    }

}
