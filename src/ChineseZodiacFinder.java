import java.time.LocalDate;

/**
 * Created by matt on 9/7/15.
 */
public class ChineseZodiacFinder {
    public static String ChineseZodiac(LocalDate dateOfBirth){
        String yourChineseZodiac = "";

        String[] chineseZodiac = new String[] {"Rat", "Ox", "Tiger", "Rabbit",
                "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};

        String[] zodiacSigns = new String[96];
        int c = 0;

        //This loops through the 12 element chineseZodiac array above eight times to populate the zodiacSigns array
        for (int masterCounter = 0; masterCounter < 8; masterCounter++)
        {
            for (int i = 0; i < 12; i++)
            {
                zodiacSigns[c] = chineseZodiac[i];
                c += 1;
            }
        }

        // This runs through the 12-year Chinese Zodiac cycle eight times
        LocalDate[][] zodiacRange = {
            {LocalDate.of(1924,2,5), LocalDate.of(1925, 1, 23)},    // Rat
            {LocalDate.of(1925,1,24), LocalDate.of(1926,2,12)},   // Ox
            {LocalDate.of(1926,2,13), LocalDate.of(1927,2,1)},    // Tiger
            {LocalDate.of(1927,2,2), LocalDate.of(1928,1,22)},    // Rabbit
            {LocalDate.of(1928,1,23), LocalDate.of(1929,2,9)},    // Dragon
            {LocalDate.of(1929,2,10), LocalDate.of(1930,1,29)},   // Snake
            {LocalDate.of(1930,1,30), LocalDate.of(1931,2,16)},   // Horse
            {LocalDate.of(1931,2,17), LocalDate.of(1932,2,5)},    // Goat
            {LocalDate.of(1932,2,6), LocalDate.of(1933,1,25)},    // Monkey
            {LocalDate.of(1933,1,26), LocalDate.of(1934,2,13)},   // Rooster
            {LocalDate.of(1934,2,14), LocalDate.of(1935,2,3)},    // Dog
            {LocalDate.of(1935,2,4), LocalDate.of(1936,1,23)},    // Pig
            {LocalDate.of(1936,1,24), LocalDate.of(1937,2,10)},   // Rat
            {LocalDate.of(1937,2,11), LocalDate.of(1938,1,30)},   // Ox
            {LocalDate.of(1938,1,31), LocalDate.of(1939,2,18)},   // Tiger
            {LocalDate.of(1939,2,19), LocalDate.of(1940,2,7)},    // Rabbit
            {LocalDate.of(1940,2,8), LocalDate.of(1941,1,26)},    // Dragon
            {LocalDate.of(1941,1,27), LocalDate.of(1942,2,14)},   // Snake
            {LocalDate.of(1942,2,15), LocalDate.of(1943,2,4)},    // Horse
            {LocalDate.of(1943,2,5), LocalDate.of(1944,1,24)},    // Goat
            {LocalDate.of(1944,1,25), LocalDate.of(1945,2,12)},   // Monkey
            {LocalDate.of(1945,2,13), LocalDate.of(1946,2,1)},    // Rooster
            {LocalDate.of(1946,2,2), LocalDate.of(1947,1,21)},    // Dog
            {LocalDate.of(1947,1,22), LocalDate.of(1948,2,9)},    // Pig
            {LocalDate.of(1948,2,10), LocalDate.of(1949,1,28)},   // Rat
            {LocalDate.of(1949,1,29), LocalDate.of(1950,2,16)},   // Ox
            {LocalDate.of(1950,2,17), LocalDate.of(1951,2,5)},    // Tiger
            {LocalDate.of(1951,2,6), LocalDate.of(1952,1,26)},    // Rabbit
            {LocalDate.of(1952,1,27), LocalDate.of(1953,2,13)},   // Dragon
            {LocalDate.of(1953,2,14), LocalDate.of(1954,2,2)},    // Snake
            {LocalDate.of(1954,2,3), LocalDate.of(1955,1,23)},    // Horse
            {LocalDate.of(1955,1,24), LocalDate.of(1956,2,11)},   // Goat
            {LocalDate.of(1956,2,12), LocalDate.of(1957,1,30)},   // Monkey
            {LocalDate.of(1957,1,31), LocalDate.of(1958,2,17)},   // Rooster
            {LocalDate.of(1958,2,18), LocalDate.of(1959,2,7)},    // Dog
            {LocalDate.of(1959,2,8), LocalDate.of(1960,1,27)},    // Pig
            {LocalDate.of(1960,1,28), LocalDate.of(1961,2,14)},   // Rat
            {LocalDate.of(1961,2,15), LocalDate.of(1962,2,4)},   // Ox
            {LocalDate.of(1962,2,5), LocalDate.of(1963,1,24)},    // Tiger
            {LocalDate.of(1963,1,25), LocalDate.of(1964,2,12)},    // Rabbit
            {LocalDate.of(1964,2,13), LocalDate.of(1965,2,1)},   // Dragon
            {LocalDate.of(1965,2,2), LocalDate.of(1966,1,20)},    // Snake
            {LocalDate.of(1966,1,21), LocalDate.of(1967,2,8)},    // Horse
            {LocalDate.of(1967,2,9), LocalDate.of(1968,1,29)},   // Goat
            {LocalDate.of(1968,1,30), LocalDate.of(1969,2,16)},   // Monkey
            {LocalDate.of(1969,2,17), LocalDate.of(1970,2,5)},   // Rooster
            {LocalDate.of(1970,2,6), LocalDate.of(1971,1,26)},    // Dog
            {LocalDate.of(1971,1,27), LocalDate.of(1972,2,14)},    // Pig
            {LocalDate.of(1972,2,15), LocalDate.of(1973,2,2)},   // Rat
            {LocalDate.of(1973,2,3), LocalDate.of(1974,1,22)},   // Ox
            {LocalDate.of(1974,1,23), LocalDate.of(1975,2,10)},    // Tiger
            {LocalDate.of(1975,2,11), LocalDate.of(1976,1,30)},    // Rabbit
            {LocalDate.of(1976,1,31), LocalDate.of(1977,2,17)},   // Dragon
            {LocalDate.of(1977,2,18), LocalDate.of(1978,2,6)},    // Snake
            {LocalDate.of(1978,2,7), LocalDate.of(1979,1,27)},    // Horse
            {LocalDate.of(1979,1,28), LocalDate.of(1980,2,15)},   // Goat
            {LocalDate.of(1980,2,16), LocalDate.of(1981,2,4)},   // Monkey
            {LocalDate.of(1981,2,5), LocalDate.of(1982,1,24)},   // Rooster
            {LocalDate.of(1982,1,25), LocalDate.of(1983,2,12)},    // Dog
            {LocalDate.of(1983,2,13), LocalDate.of(1984,2,1)},    // Pig
            {LocalDate.of(1984,2,2), LocalDate.of(1985,2,19)},   // Rat
            {LocalDate.of(1985,2,20), LocalDate.of(1986,2,8)},   // Ox
            {LocalDate.of(1986,2,9), LocalDate.of(1987,1,28)},    // Tiger
            {LocalDate.of(1987,1,29), LocalDate.of(1988,2,16)},    // Rabbit
            {LocalDate.of(1988,2,17), LocalDate.of(1989,2,5)},   // Dragon
            {LocalDate.of(1989,2,6), LocalDate.of(1990,1,26)},    // Snake
            {LocalDate.of(1990,1,27), LocalDate.of(1991,2,14)},    // Horse
            {LocalDate.of(1991,2,15), LocalDate.of(1992,2,3)},   // Goat
            {LocalDate.of(1992,2,4), LocalDate.of(1993,1,22)},   // Monkey
            {LocalDate.of(1993,1,23), LocalDate.of(1994,2,9)},   // Rooster
            {LocalDate.of(1994,2,10), LocalDate.of(1995,1,30)},    // Dog
            {LocalDate.of(1995,1,31), LocalDate.of(1996,2,18)},    // Pig
            {LocalDate.of(1996,2,19), LocalDate.of(1997,2,6)},   // Rat
            {LocalDate.of(1997,2,7), LocalDate.of(1998,1,27)},   // Ox
            {LocalDate.of(1998,1,28), LocalDate.of(1999,2,15)},    // Tiger
            {LocalDate.of(1999,2,16), LocalDate.of(2000,2,4)},    // Rabbit
            {LocalDate.of(2000,2,5), LocalDate.of(2001,1,23)},   // Dragon
            {LocalDate.of(2001,1,24), LocalDate.of(2002,2,11)},    // Snake
            {LocalDate.of(2002,2,12), LocalDate.of(2003,1,31)},    // Horse
            {LocalDate.of(2003,2,1), LocalDate.of(2004,1,21)},   // Goat
            {LocalDate.of(2004,1,22), LocalDate.of(2005,2,8)},   // Monkey
            {LocalDate.of(2005,2,9), LocalDate.of(2006,1,28)},   // Rooster
            {LocalDate.of(2006,1,29), LocalDate.of(2007,2,17)},    // Dog
            {LocalDate.of(2007,2,18), LocalDate.of(2008,2,6)},    // Pig
            {LocalDate.of(2008,2,7), LocalDate.of(2009,1,25)},   // Rat
            {LocalDate.of(2009,1,26), LocalDate.of(2010,2,13)},   // Ox
            {LocalDate.of(2010,2,14), LocalDate.of(2011,2,2)},    // Tiger
            {LocalDate.of(2011,2,3), LocalDate.of(2012,1,22)},    // Rabbit
            {LocalDate.of(2012,1,23), LocalDate.of(2013,2,9)},   // Dragon
            {LocalDate.of(2013,2,10), LocalDate.of(2014,1,30)},    // Snake
            {LocalDate.of(2014,1,31), LocalDate.of(2015,2,18)},    // Horse
            {LocalDate.of(2015,2,19), LocalDate.of(2016,2,7)},   // Goat
            {LocalDate.of(2016,2,8), LocalDate.of(2017,1,27)},   // Monkey
            {LocalDate.of(2017,1,28), LocalDate.of(2018,2,15)},   // Rooster
            {LocalDate.of(2018,2,16), LocalDate.of(2019,2,4)},    // Dog
            {LocalDate.of(2019,2,5), LocalDate.of(2020,1,24)},    // Pig
        };

        int vertLength = zodiacRange.length;

        for (int i = 0; i <= vertLength; i++)
        {
            if ((dateOfBirth.equals(zodiacRange[i][0]) || dateOfBirth.isAfter(zodiacRange[i][0]))
                    && ((dateOfBirth.equals(zodiacRange[i][1])) || dateOfBirth.isBefore(zodiacRange[i][1])))
            {
                yourChineseZodiac = zodiacSigns[i];
                break;
            }
        }
        return yourChineseZodiac;
    }
}
