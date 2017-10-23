package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    Statistics statistics1 ;
    double averagePostForUser;
    double averageCommentForUser;
    double averageCommentForPost;


    public ForumStatistics(Statistics statistics1) {
        this.statistics1 = statistics1;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        ForumStatistics forumStatistics = new ForumStatistics(statistics1);
        int quanityOfUsers = statistics1.usersNames().size();
        int postQuanity = statistics1.postsCount();
        int commentQuanity = statistics1.commentsCount();
        this.averagePostForUser = postQuanity / quanityOfUsers ;
        this.averageCommentForUser = commentQuanity / quanityOfUsers ;
        this.averageCommentForPost = commentQuanity / postQuanity ;

    }
}
