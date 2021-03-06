import java.time.LocalDate;

/**
 * Created by matt on 9/7/15.
 */
public class Person {
    private String name = "";
    private String favoriteColor = "";
    private String westernZodiac = "";
    private String chineseZodiac = "";
    private int age = 0;
    private String placeToGo = "";
    private LocalDate dateOfBirth;

    public Person (String name, LocalDate dateOfBirth, int age, String favoriteColor)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    public String Destination (String myFavoriteColor)
    {
        if (myFavoriteColor.toLowerCase().trim().equals("blue")) {
            placeToGo = "Toadsuck";
        }
        else {
            placeToGo = "Little Flock";
        }
        return placeToGo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getwesternZodiac() {
        return westernZodiac;
    }

    public void setwesternZodiac(String westernZodiac) {
        this.westernZodiac = westernZodiac;
    }

    public String getChineseZodiac() {
        return chineseZodiac;
    }

    public void setChineseZodiac(String chineseZodiac) {
        this.chineseZodiac = chineseZodiac;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlaceToGo() {
        return placeToGo;
    }

    public void setPlaceToGo(String placeToGo) {
        this.placeToGo = placeToGo;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}