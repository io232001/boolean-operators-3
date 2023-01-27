package it.develhope.booleanoperators;

public class test
{
    public static void main(String arg[])
    {
        System.out.println(!(!(!(false ^ false) || (true && true))));
        int x=3;
        int y=2;
        System.out.println(!((x * y) <= 6) && (x - y != 1));

    }

}
