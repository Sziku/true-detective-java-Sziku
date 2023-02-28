package com.codecool.truedetective;

import java.util.Objects;

public class WhatIf {
    public static void main(String[] args) {

    }

    public static boolean isTwoDigitOdd(int number) {
        if (number % 2 != 0) {
            if (number > 9) {
                if (number < 100) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean hasAccess(int user, int[] usersGroups,
                                    int fileOwner, boolean writableByOwner,
                                    int fileGroup, boolean writableByGroup,
                                    boolean writableByOthers, boolean sudoMode) {
        if (sudoMode) {
            return true;
        } else if (writableByOthers) {
            return true;
        } else if (writableByGroup) {
            if(fileGroup==usersGroups[0]){
                return true;
            } else if (fileGroup==usersGroups[1]) {
                return true;
            }else {
                return false;
            }
        } else if (writableByOwner) {
            return user == fileOwner;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if(year%100==0){
            if(year%400==0){
                return true;
            }
            return false;
        }else if(year%4==0){
            return true;
        }else {
            return false;
        }

    }

    public static boolean isSunday(int day, String weekdayOfFirst) {
        String[] week = {"M", "Tu", "W", "Th", "F", "Sa", "Su"};

        if(weekdayOfFirst.equals(week[0])){
            if(day==7){
                return true;
            } else if (day==14) {
                return true;
            }else if (day==21){
                return true;
            } else if (day==28) {
                return true;
            }else {
                return false;
            }

        }
        if(weekdayOfFirst.equals(week[1])){
            if(day==6){
                return true;
            } else if (day==13) {
                return true;
            }else if (day==20){
                return true;
            } else if (day==27) {
                return true;
            }else {
                return false;
            }

        }
        if(weekdayOfFirst.equals(week[2])){
            if(day==5){
                return true;
            } else if (day==12) {
                return true;
            }else if (day==19){
                return true;
            } else if (day==26) {
                return true;
            }else {
                return false;
            }

        }
        if(weekdayOfFirst.equals(week[3])){
            if(day==4){
                return true;
            } else if (day==11) {
                return true;
            }else if (day==18){
                return true;
            } else if (day==25) {
                return true;
            }else {
                return false;
            }

        }
        if(weekdayOfFirst.equals(week[4])){
            if(day==3){
                return true;
            } else if (day==10) {
                return true;
            }else if (day==17){
                return true;
            } else if (day==24) {
                return true;
            } else if (day==31) {
                return true;
            } else {
                return false;
            }

        }
        if(weekdayOfFirst.equals(week[5])){
            if(day==2){
                return true;
            } else if (day==9) {
                return true;
            }else if (day==16){
                return true;
            } else if (day==23) {
                return true;
            } else if (day==30) {
                return true;
            } else {
                return false;
            }

        }
        if(weekdayOfFirst.equals(week[6])){
            if(day==1){
                return true;
            } else if (day==8) {
                return true;
            }else if (day==15){
                return true;
            } else if (day==22) {
                return true;
            } else if (day==29) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean shouldBringUmbrella(boolean rains, int windScale, boolean cloudy,
                                              boolean redSky, boolean strongFlowerSmell,
                                              boolean spidersDown, boolean lyingCattle,
                                              boolean strongSunshine) {
        if(windScale<7){
            if (rains){
                return  true;
            } else if (strongSunshine) {
                return true;
            } else {
                if (cloudy){
                    if (redSky){
                        return true;
                    } else if (strongFlowerSmell) {
                        return true;
                    } else if (spidersDown) {
                        return true;
                    } else if (lyingCattle) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static boolean shouldTakeANap(boolean wantTo, boolean troubleSleeping,
                                         boolean after4Pm, boolean atWork, boolean madBoss,
                                         boolean have30M, boolean have10M) {
        if (wantTo) {
            if (!troubleSleeping){
                if (!after4Pm){
                    if (atWork){
                        if (!madBoss){
                            if (have30M){
                                return true;
                            }else {
                                if(have10M){
                                    return true;
                                }
                            }
                        }
                    }else{
                        if (have30M){
                            return true;
                        }else {
                            if(have10M){
                                return true;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }
}
