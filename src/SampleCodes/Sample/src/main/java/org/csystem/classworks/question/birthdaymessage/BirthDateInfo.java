package org.csystem.classworks.question.birthdaymessage;


import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;

public class BirthDateInfo {
    private static final double ms_dividerForAge = 1000. * 60 * 60 * 24 * 365;
    private final Calendar m_birthDate;

    public BirthDateInfo(int day, int month, int year) {

        m_birthDate = new GregorianCalendar(year, month - 1, day);
    }

    public int getDay() {
        return m_birthDate.get(Calendar.DAY_OF_MONTH);
    }

    public int getMonth() {
        return m_birthDate.get(Calendar.MONTH) + 1;
    }

    public int getYear() {
        return m_birthDate.get(Calendar.YEAR);
    }

    public double getAge() {
        var today = new GregorianCalendar();

        return (today.getTimeInMillis() - m_birthDate.getTimeInMillis()) / ms_dividerForAge;
    }

    public BirthDateStatus getBirtDateStatus() {
        var today = new GregorianCalendar();
        today = new GregorianCalendar(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH));

        var birthDay = new GregorianCalendar(today.get(YEAR), m_birthDate.get(MONTH), m_birthDate.get(DAY_OF_MONTH));

        BirthDateStatus status = BirthDateStatus.SAME;

        if (birthDay.after(today))
            status = BirthDateStatus.BEFORE;
        else if (birthDay.before(today))
            status = BirthDateStatus.AFTER;

        return status;
    }
}
