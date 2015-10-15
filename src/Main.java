import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!\n");

        String name;
        String birthDate;
        String favoriteColor;
        String westernZodiac = "";
        String chineseZodiac = "";
        String placeToGo;
        LocalDate dateOfBirth;
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name? ");
        name = input.next();

        System.out.println(name + ", you are the gangster of love.");
        System.out.println("");

        System.out.println("What is your birthday? Use the 01/01/1111 format.");
        birthDate = input.next();
        birthDate = birthDate.trim();

        dateOfBirth = BatBelt.BirthDayToBirthDate(birthDate);
        int age = BatBelt.DetermineAge(dateOfBirth);

        System.out.println("And what is your favorite color?");
        favoriteColor = input.next();

        Person javaDev = new Person(name, dateOfBirth, age, favoriteColor);
        javaDev.setPlaceToGo(placeToGo = javaDev.Destination(favoriteColor));
        javaDev.setwesternZodiac(westernZodiac = BatBelt.WesternZodiac(javaDev.getDateOfBirth()));
        javaDev.setChineseZodiac(chineseZodiac = ChineseZodiacFinder.ChineseZodiac(javaDev.getDateOfBirth()));

        System.out.println ("");
        System.out.println (javaDev.getName() + ", The stars indicate an opening for " + javaDev.getAge() +
                "-year-old Java developer " + "in " + javaDev.getPlaceToGo() + ". Being a " + javaDev.getwesternZodiac()
                + " and choosing " + javaDev.getFavoriteColor() + " is a sign of " + "future success as is being born in" +
                " the year of " + javaDev.getChineseZodiac() + ".  You should move immediately.");
    }
}
