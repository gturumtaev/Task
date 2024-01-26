//Напишите код, с помощью которого можно разделить строку на части.


public class Main {
    public static void main(String[] args) {
        String s = "Эту строку нужно разделить";

        String[] separationString = s.split(" ");

        for (String string : separationString) {
            System.out.println(string);
        }
    }
}