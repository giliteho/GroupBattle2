package org.tempuri;

import org.jinouts.jws.WebMethod;
import org.jinouts.jws.WebParam;
import org.jinouts.jws.WebResult;
import org.jinouts.jws.WebService;
import org.jinouts.xml.bind.annotation.XmlSeeAlso;
import org.jinouts.xml.ws.RequestWrapper;
import org.jinouts.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-10-29T19:36:31.929+02:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "WebService1Soap")
@XmlSeeAlso({ObjectFactory.class})
public interface WebService1Soap {

    /**
     * Add a new contest to DB. There should be at least 2 teams, the 3rd team is optional. The user will be playing this new contest!
     */
    @WebResult(name = "AddNewContestResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddNewContest", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddNewContest")
    @WebMethod(operationName = "AddNewContest", action = "http://tempuri.org/AddNewContest")
    @ResponseWrapper(localName = "AddNewContestResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddNewContestResponse")
    public org.tempuri.BasicResponse addNewContest(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "contestItem1", targetNamespace = "http://tempuri.org/")
        java.lang.String contestItem1,
        @WebParam(name = "contestItem2", targetNamespace = "http://tempuri.org/")
        java.lang.String contestItem2,
        @WebParam(name = "contestItem3", targetNamespace = "http://tempuri.org/")
        java.lang.String contestItem3,
        @WebParam(name = "topicId", targetNamespace = "http://tempuri.org/")
        int topicId,
        @WebParam(name = "durationInHours", targetNamespace = "http://tempuri.org/")
        int durationInHours
    );

    /**
     * Returns the top players of a given contest
     */
    @WebResult(name = "GetContestTopPlayersResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetContestTopPlayers", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetContestTopPlayers")
    @WebMethod(operationName = "GetContestTopPlayers", action = "http://tempuri.org/GetContestTopPlayers")
    @ResponseWrapper(localName = "GetContestTopPlayersResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetContestTopPlayersResponse")
    public org.tempuri.ArrayOfContestUser getContestTopPlayers(
        @WebParam(name = "contestId", targetNamespace = "http://tempuri.org/")
        int contestId,
        @WebParam(name = "amountOfPlayers", targetNamespace = "http://tempuri.org/")
        int amountOfPlayers
    );

    /**
     * Returns whether there is a user with the given FacebookId or a given Email
     */
    @WebResult(name = "IsUserExistsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsUserExists", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsUserExists")
    @WebMethod(operationName = "IsUserExists", action = "http://tempuri.org/IsUserExists")
    @ResponseWrapper(localName = "IsUserExistsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsUserExistsResponse")
    public org.tempuri.BasicResponse isUserExists(
        @WebParam(name = "facebookId", targetNamespace = "http://tempuri.org/")
        java.lang.String facebookId,
        @WebParam(name = "email", targetNamespace = "http://tempuri.org/")
        java.lang.String email
    );

    /**
     * Returns a list of user's contests
     */
    @WebResult(name = "RenewFacebookAccessTokenResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RenewFacebookAccessToken", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RenewFacebookAccessToken")
    @WebMethod(operationName = "RenewFacebookAccessToken", action = "http://tempuri.org/RenewFacebookAccessToken")
    @ResponseWrapper(localName = "RenewFacebookAccessTokenResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RenewFacebookAccessTokenResponse")
    public org.tempuri.BasicResponse renewFacebookAccessToken(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "newAccessToken", targetNamespace = "http://tempuri.org/")
        java.lang.String newAccessToken
    );

    /**
     * Used for debug
     */
    @WebResult(name = "TestResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Test", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Test")
    @WebMethod(operationName = "Test", action = "http://tempuri.org/Test")
    @ResponseWrapper(localName = "TestResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.TestResponse")
    public org.tempuri.BasicResponse test();

    /**
     * Obtains Contests-users table
     */
    @WebResult(name = "GetListOfContestsUsersResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListOfContestsUsers", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfContestsUsers")
    @WebMethod(operationName = "GetListOfContestsUsers", action = "http://tempuri.org/GetListOfContestsUsers")
    @ResponseWrapper(localName = "GetListOfContestsUsersResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfContestsUsersResponse")
    public org.tempuri.ArrayOfContestUser getListOfContestsUsers();

    /**
     * Returns a list of topics
     */
    @WebResult(name = "GetListOfTopicsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListOfTopics", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfTopics")
    @WebMethod(operationName = "GetListOfTopics", action = "http://tempuri.org/GetListOfTopics")
    @ResponseWrapper(localName = "GetListOfTopicsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfTopicsResponse")
    public org.tempuri.ArrayOfTopic getListOfTopics();

    /**
     * Returns a list of contests in which the user and his friends are **NOT** playing
     */
    @WebResult(name = "GetListOfGlobalContestsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListOfGlobalContests", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfGlobalContests")
    @WebMethod(operationName = "GetListOfGlobalContests", action = "http://tempuri.org/GetListOfGlobalContests")
    @ResponseWrapper(localName = "GetListOfGlobalContestsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfGlobalContestsResponse")
    public org.tempuri.ArrayOfContest getListOfGlobalContests(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "offset", targetNamespace = "http://tempuri.org/")
        int offset,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        int count
    );

    /**
     * Adds a new user to database
     */
    @WebResult(name = "AddFacebookUserResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddFacebookUser", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddFacebookUser")
    @WebMethod(operationName = "AddFacebookUser", action = "http://tempuri.org/AddFacebookUser")
    @ResponseWrapper(localName = "AddFacebookUserResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddFacebookUserResponse")
    public org.tempuri.BasicResponse addFacebookUser(
        @WebParam(name = "accessToken", targetNamespace = "http://tempuri.org/")
        java.lang.String accessToken
    );

    /**
     * Adds a user to a contest
     */
    @WebResult(name = "AddUserToContestResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddUserToContest", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddUserToContest")
    @WebMethod(operationName = "AddUserToContest", action = "http://tempuri.org/AddUserToContest")
    @ResponseWrapper(localName = "AddUserToContestResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AddUserToContestResponse")
    public org.tempuri.BasicResponse addUserToContest(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "contestId", targetNamespace = "http://tempuri.org/")
        int contestId,
        @WebParam(name = "itemId", targetNamespace = "http://tempuri.org/")
        int itemId
    );

    /**
     * Returns a list of user's friends contests
     */
    @WebResult(name = "GetListOfUserFriendsContestsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListOfUserFriendsContests", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfUserFriendsContests")
    @WebMethod(operationName = "GetListOfUserFriendsContests", action = "http://tempuri.org/GetListOfUserFriendsContests")
    @ResponseWrapper(localName = "GetListOfUserFriendsContestsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfUserFriendsContestsResponse")
    public org.tempuri.ArrayOfContest getListOfUserFriendsContests(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "offset", targetNamespace = "http://tempuri.org/")
        int offset,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        int count
    );

    /**
     * Obtains Contests table
     */
    @WebResult(name = "GetListOfContestsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListOfContests", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfContests")
    @WebMethod(operationName = "GetListOfContests", action = "http://tempuri.org/GetListOfContests")
    @ResponseWrapper(localName = "GetListOfContestsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfContestsResponse")
    public org.tempuri.ArrayOfContest getListOfContests();

    /**
     * Gets a random question from the DB and its answers. Adds +1 to the amount of times this question has been shown to the user
     */
    @WebResult(name = "GetContestQuestionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetContestQuestion", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetContestQuestion")
    @WebMethod(operationName = "GetContestQuestion", action = "http://tempuri.org/GetContestQuestion")
    @ResponseWrapper(localName = "GetContestQuestionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetContestQuestionResponse")
    public org.tempuri.Question getContestQuestion(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "contestId", targetNamespace = "http://tempuri.org/")
        int contestId
    );

    /**
     * Returns information about a specific contest
     */
    @WebResult(name = "GetContestInfoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetContestInfo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetContestInfo")
    @WebMethod(operationName = "GetContestInfo", action = "http://tempuri.org/GetContestInfo")
    @ResponseWrapper(localName = "GetContestInfoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetContestInfoResponse")
    public org.tempuri.Contest getContestInfo(
        @WebParam(name = "contestId", targetNamespace = "http://tempuri.org/")
        int contestId
    );

    /**
     * Returns a list of user's contests
     */
    @WebResult(name = "GetListOfUserContestsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListOfUserContests", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfUserContests")
    @WebMethod(operationName = "GetListOfUserContests", action = "http://tempuri.org/GetListOfUserContests")
    @ResponseWrapper(localName = "GetListOfUserContestsResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfUserContestsResponse")
    public org.tempuri.ArrayOfContest getListOfUserContests(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "offset", targetNamespace = "http://tempuri.org/")
        int offset,
        @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
        int count
    );

    /**
     * Sets an answer to a given question... updates needed tables in the DB
     */
    @WebResult(name = "SetAnswerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SetAnswer", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SetAnswer")
    @WebMethod(operationName = "SetAnswer", action = "http://tempuri.org/SetAnswer")
    @ResponseWrapper(localName = "SetAnswerResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SetAnswerResponse")
    public org.tempuri.BasicResponse setAnswer(
        @WebParam(name = "userId", targetNamespace = "http://tempuri.org/")
        int userId,
        @WebParam(name = "contestId", targetNamespace = "http://tempuri.org/")
        int contestId,
        @WebParam(name = "questionId", targetNamespace = "http://tempuri.org/")
        int questionId,
        @WebParam(name = "answerId", targetNamespace = "http://tempuri.org/")
        int answerId
    );

    /**
     * returns the log table. value '0' in limit is 'no limit'!
     */
    @WebResult(name = "GetLogTableResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetLogTable", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetLogTable")
    @WebMethod(operationName = "GetLogTable", action = "http://tempuri.org/GetLogTable")
    @ResponseWrapper(localName = "GetLogTableResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetLogTableResponse")
    public org.tempuri.ArrayOfLog getLogTable();

    /**
     * Obtains Users table
     */
    @WebResult(name = "GetListOfUsersResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListOfUsers", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfUsers")
    @WebMethod(operationName = "GetListOfUsers", action = "http://tempuri.org/GetListOfUsers")
    @ResponseWrapper(localName = "GetListOfUsersResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetListOfUsersResponse")
    public org.tempuri.ArrayOfUser getListOfUsers();
}
