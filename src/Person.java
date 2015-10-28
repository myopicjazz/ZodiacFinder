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

<<<<<<< HEAD
    public String Destination (String myFavoriteColor)
=======
    private String Destination (String myFavoriteColor)
>>>>>>> 90efb7b8cf24d2d24172fc8d0febae75cfd97f8d
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

<<<<<<< HEAD
    public void setName(String name) {
        this.name = name;
    }
=======
    /*public void setName(String name) {
        this.name = name;
    }*/
>>>>>>> 90efb7b8cf24d2d24172fc8d0febae75cfd97f8d

    public String getFavoriteColor() {
        return favoriteColor;
    }

<<<<<<< HEAD
    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getwesternZodiac() {
        return westernZodiac;
    }

    public void setwesternZodiac(String westernZodiac) {
        this.westernZodiac = westernZodiac;
=======
    /*public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }*/

    public String getWesternZodiac() {
        return westernZodiac;
    }

    public String setWesternZodiac (LocalDate dob){
        westernZodiac = BatBelt.WesternZodiac(dob);
        return westernZodiac;
>>>>>>> 90efb7b8cf24d2d24172fc8d0febae75cfd97f8d
    }

    public String getChineseZodiac() {
        return chineseZodiac;
    }

<<<<<<< HEAD
    public void setChineseZodiac(String chineseZodiac) {
        this.chineseZodiac = chineseZodiac;
=======
    public String setChineseZodiac(LocalDate dob){
        chineseZodiac = ChineseZodiacFinder.ChineseZodiac(dob);
        return chineseZodiac;
>>>>>>> 90efb7b8cf24d2d24172fc8d0febae75cfd97f8d
    }

    public int getAge() {
        return age;
    }

<<<<<<< HEAD
    public void setAge(int age) {
        this.age = age;
    }

    public String getPlaceToGo() {
        return placeToGo;
    }

    public void setPlaceToGo(String placeToGo) {
        this.placeToGo = placeToGo;
=======
    /*public void setAge(int age) {
        this.age = age;
    }*/

    public String getPlaceToGo() { return placeToGo; }

    public String setPlaceToGo(String favePlace) {
        placeToGo = Destination(favePlace);
        return placeToGo;
>>>>>>> 90efb7b8cf24d2d24172fc8d0febae75cfd97f8d
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

<<<<<<< HEAD
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
=======
    /*public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }*/
>>>>>>> 90efb7b8cf24d2d24172fc8d0febae75cfd97f8d
}
