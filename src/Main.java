import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal pes = new Animal();
        pes.name = "Sobaka";
        pes.setMessage("Hello im Sobaka");
        pes.scream();
        System.out.println();

        Amphibian frog = new Amphibian();
        frog.year = 10;
        frog.setMessage("hello im lyagushka");
        frog.scream();

        MakeArrOne arr1=new MakeArrOne();
        arr1.length =10;
        //System.out.println(Arrays.toString(arr1.Get()));

        MakeArrTwo arr2= new MakeArrTwo();

        test(arr1);

        Kvadrat quadrate=new Kvadrat();
        System.out.println("The area of the square is equal to "+quadrate.square(10, 10));
    }

    public static void test (InterfaceNew arg) {
        arg.Get();
    }

}
