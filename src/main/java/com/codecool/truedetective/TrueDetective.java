package com.codecool.truedetective;

public class TrueDetective {
    public static void main(String[] args) {

    }

    public static boolean isTwoDigitOdd(int number) {
        return number % 2 != 0 && 9 < number && number < 100;
    }

    public static boolean hasAccess(int user, int[] usersGroups,
                                    int fileOwner, boolean writableByOwner,
                                    int fileGroup, boolean writableByGroup,
                                    boolean writableByOthers, boolean sudoMode) {

        return sudoMode || writableByOthers || (writableByGroup && (usersGroups[0] == fileGroup || usersGroups[1] == fileGroup)) || (writableByOwner && user == fileOwner);
    }

    public static boolean isLeapYear(int year) {
        return   (year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0 && year % 400 != 0);
    }

    public static boolean isSunday(int day, String weekdayOfFirst) {
       return ((weekdayOfFirst.equals("M")&&day%7==0)||(weekdayOfFirst.equals("Tu")&&(day+1)%7==0) || (weekdayOfFirst.equals("W")&&(day+2)%7==0) || (weekdayOfFirst.equals("Th")&&(day+3)%7==0) || (weekdayOfFirst.equals("F")&&(day+4)%7==0) || (weekdayOfFirst.equals("Sa")&&(day+5)%7==0) || (weekdayOfFirst.equals("Su")&&(day+6)%7==0));

    }

    public static boolean shouldBringUmbrella(boolean rains, int windScale, boolean cloudy,
                                              boolean redSky, boolean strongFlowerSmell,
                                              boolean spidersDown, boolean lyingCattle,
                                              boolean strongSunshine) {


        return windScale < 7 && (rains || strongSunshine || (cloudy && (redSky || strongFlowerSmell || spidersDown || lyingCattle)));

    }

    public static boolean shouldTakeANap(boolean wantTo, boolean troubleSleeping,
                                         boolean after4Pm, boolean atWork, boolean madBoss,
                                         boolean have30M, boolean have10M) {

        return (wantTo && !troubleSleeping && !after4Pm) && (!madBoss && (have30M || have10M));
    }
}
