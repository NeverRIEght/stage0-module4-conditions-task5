package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String isLeapYear;

        switch (year) {
            case 1700, 1800, 1900, 2100,
                    2200, 2300, 2500, 2600:
                isLeapYear = "not leap";
                break;
            default:
                isLeapYear = year % 4 == 0 ?
                        "leap" : "not leap";
        }

        System.out.println(isLeapYear);
    }
}
