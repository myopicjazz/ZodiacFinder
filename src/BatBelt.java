import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Created by matt on 9/7/15.
 */
public class BatBelt {
    public static LocalDate BirthDateConverter(String birthdate)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateOfBirth = LocalDate.now();
        try
        {
            dateOfBirth = LocalDate.parse(birthdate, formatter);
        }
        catch (DateTimeParseException e)
        {
            System.out.println("You need to rethink your date entry technique.");
            System.exit(1);
        }
        return dateOfBirth;
    }

    public static LocalDate BirthDayToBirthDate( String birthDate)
    {
        LocalDate dateOfBirth = BirthDateConverter(birthDate);
        return dateOfBirth;
    }

    public static int DetermineAge (LocalDate dateOfBirth){
        LocalDate currentDate = LocalDate.now();
        Period yearsOfAge = Period.between(dateOfBirth, currentDate);
        int age = yearsOfAge.getYears();
        return age;
    }

    public static String WesternZodiac (LocalDate dateOfBirth){
        int day = dateOfBirth.getDayOfMonth();
        String month = dateOfBirth.getMonth().name();
        String myZodiacSign = "";
        if (month.equals("JANUARY"))
        {
            if (day >= 21)
            {
                myZodiacSign = "Aquarius";
            }
            else
            {
                myZodiacSign = "Capricorn";
            }
        }
        if (month.equals("FEBRUARY"))
        {
            if (day >= 20)
            {
                myZodiacSign = "Pisces";
            }
            else
            {
                myZodiacSign = "Aquarius";
            }
        }
        if (month.equals("MARCH"))
        {
            if (day >= 21)
            {
                myZodiacSign = "Aries";
            }
            else
            {
                myZodiacSign = "Pisces";
            }
        }
        if (month.equals("APRIL"))
        {
            if (day >= 21)
            {
                myZodiacSign = "Taurus";
            }
            else
            {
                myZodiacSign = "Aries";
            }
        }
        if (month.equals("MAY"))
        {
            if (day >= 22)
            {
                myZodiacSign = "Gemini";
            }
            else
            {
                myZodiacSign = "Taurus";
            }
        }
        if (month.equals("JUNE"))
        {
            if (day >= 22)
            {
                myZodiacSign = "Cancer";
            }
            else
            {
                myZodiacSign = "Gemini";
            }
        }
        if (month.equals("JULY"))
        {
            if (day >= 23)
            {
                myZodiacSign = "Leo";
            }
            else
            {
                myZodiacSign = "Cancer";
            }
        }
        if (month.equals("AUGUST"))
        {
            if (day >= 22)
            {
                myZodiacSign = "Virgo";
            }
            else
            {
                myZodiacSign = "Leo";
            }
        }
        if (month.equals("SEPTEMBER"))
        {
            if (day >= 24)
            {
                myZodiacSign = "Libra";
            }
            else
            {
                myZodiacSign = "Virgo";
            }
        }
        if (month.equals("OCTOBER"))
        {
            if (day >= 24)
            {
                myZodiacSign = "Scorpio";
            }
            else
            {
                myZodiacSign = "Libra";
            }
        }
        if (month.equals("NOVEMBER"))
        {
            if (day >= 23)
            {
                myZodiacSign = "Sagittarius";
            }
            else
            {
                myZodiacSign = "Scorpio";
            }
        }
        if (month.equals("DECEMBER"))
        {
            if (day >= 23)
            {
                myZodiacSign = "Capricorn";
            }
            else
            {
                myZodiacSign = "Sagittarius";
            }
        }
        return myZodiacSign;
    }
}
