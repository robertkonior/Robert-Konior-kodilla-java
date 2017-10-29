package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public final class ForumUser {
    private final int idUser;
    private final String userName;
    private final char sex ;
    private final LocalDate birthDate;
    private final int postQuantity ;

    public ForumUser(final int idUser, final String userName, final char sex, final LocalDate birthDate, final int postQuantity) {
        this.idUser = idUser;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postQuantity = postQuantity;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}
}
