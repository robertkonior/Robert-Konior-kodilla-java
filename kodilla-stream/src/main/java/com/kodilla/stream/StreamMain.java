package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(a -> a.getSex() == 'M')
                .filter(a -> Period.between(a.getBirthDate(), LocalDate.now()).getYears() > 10)
                .filter(a -> a.getPostQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, a -> a));

        System.out.println("Selected : " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}