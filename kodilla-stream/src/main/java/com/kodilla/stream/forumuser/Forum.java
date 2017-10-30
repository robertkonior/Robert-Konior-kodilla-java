package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public  Forum(){
        userList.add(new ForumUser(1,"sebix",'M', LocalDate.of(1990,5,2),3));
        userList.add(new ForumUser(2,"adix",'F',LocalDate.of(1991, Month.DECEMBER,3),1));
        userList.add(new ForumUser(3,"tomex",'M', LocalDate.of(2005,5,2),3));
        userList.add(new ForumUser(4,"piotrex",'M', LocalDate.of(1990,5,2),0));
        userList.add(new ForumUser(5,"lysy",'M', LocalDate.of(1995,11,22),3));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
