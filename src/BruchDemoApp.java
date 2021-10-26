public class BruchDemoApp
{

    public static void main(String[] args)
    {

        Bruch b24 = new Bruch(2, 4);
        Bruch b15 = new Bruch(1, 5);
        Bruch b23 = new Bruch(2, 3);

        System.out.println("b24.print() = " + b24.print());
        System.out.println("b24.toDecimal() = " + b24.toDecimal());
        System.out.println("b15.print() = " + b15.print());
        System.out.println("b15.toDecimal() = " + b15.toDecimal());

        Bruch erg = b24.multiplicate(b15);
        System.out.println("erg.print() = " + erg.print()); // 2 / 20

        erg = b24.multiplicate(b15, b23);
        System.out.println("erg.print() = " + erg.print()); // 4 / 60
    }

}
