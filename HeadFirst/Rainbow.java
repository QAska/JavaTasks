package net.tasks.HeadFirst;

/* Seven colors of the rainbow
Write a program that displays seven colors of the rainbow.
    Two lines must have three colors. The third one must have just one color.
    Separate the colors in the lines by spaces.
*/

public class Rainbow
{
    public static void main(String[] args)
    {
        String r = "red";
        String o = "orange";
        String y = "yellow";
        String g = "green";
        String b = "blue";
        String i = "indigo";
        String v = "violet";
        System.out.println(r + " " + o + " " + y);
        System.out.println(g + " " + b + " " + i);
        System.out.println(v);

// varinat
        String[] rainbow = {"red","orange","yellow","green","blue","indigo","violet"};
        for(int k = 0; k < 7; k++){
            if((k + 1) % 3 == 0)
                System.out.println(rainbow[k]);
            else
                System.out.print(rainbow[k]+" ");
        }
    }
}