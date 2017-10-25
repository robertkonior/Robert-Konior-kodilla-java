package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    int quantityOfUsers;
    int quantityOfPost;
    int quantityOfComment;
    double averagePostPerUser;
    double averageCommentPerUser;
    double averageCommentPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        List<String> usersList = statistics.usersNames();
        this.quantityOfUsers = usersList.size();
        this.quantityOfPost = statistics.postsCount();
        this.quantityOfComment = statistics.commentsCount();

        if (quantityOfUsers != 0 && quantityOfPost != 0) {
            this.averagePostPerUser = (double) quantityOfPost / quantityOfUsers;

        } else {
            this.averagePostPerUser = 0;
        }

        if ((quantityOfUsers != 0 && quantityOfComment != 0)) {
            this.averageCommentPerUser = (double) quantityOfComment / quantityOfUsers;
        } else {
            this.averageCommentPerUser = 0;
        }

        if (quantityOfComment != 0 && quantityOfPost != 0) {
            this.averageCommentPerPost = (double) quantityOfComment / quantityOfPost;
        } else {
            this.averageCommentPerPost = 0;
        }
    }
}
