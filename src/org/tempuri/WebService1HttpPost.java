package org.tempuri;

import org.jinouts.jws.WebMethod;
import org.jinouts.jws.WebParam;
import org.jinouts.jws.WebResult;
import org.jinouts.jws.WebService;
import org.jinouts.jws.soap.SOAPBinding;
import org.jinouts.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-10-29T19:36:31.945+02:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "WebService1HttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WebService1HttpPost {

    /**
     * Add a new contest to DB. There should be at least 2 teams, the 3rd team is optional. The user will be playing this new contest!
     */
    @WebResult(name = "BasicResponse", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "AddNewContest")
    public BasicResponse addNewContest(
        @WebParam(partName = "userId", name = "userId", targetNamespace = "http://tempuri.org/")
        java.lang.String userId,
        @WebParam(partName = "contestItem1", name = "contestItem1", targetNamespace = "http://tempuri.org/")
        java.lang.String contestItem1,
        @WebParam(partName = "contestItem2", name = "contestItem2", targetNamespace = "http://tempuri.org/")
        java.lang.String contestItem2,
        @WebParam(partName = "contestItem3", name = "contestItem3", targetNamespace = "http://tempuri.org/")
        java.lang.String contestItem3,
        @WebParam(partName = "topicId", name = "topicId", targetNamespace = "http://tempuri.org/")
        java.lang.String topicId,
        @WebParam(partName = "durationInHours", name = "durationInHours", targetNamespace = "http://tempuri.org/")
        java.lang.String durationInHours
    );

    /**
     * Returns the top players of a given contest
     */
    @WebResult(name = "ArrayOfContestUser", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetContestTopPlayers")
    public ArrayOfContestUser getContestTopPlayers(
        @WebParam(partName = "contestId", name = "contestId", targetNamespace = "http://tempuri.org/")
        java.lang.String contestId,
        @WebParam(partName = "amountOfPlayers", name = "amountOfPlayers", targetNamespace = "http://tempuri.org/")
        java.lang.String amountOfPlayers
    );

    /**
     * Returns whether there is a user with the given FacebookId or a given Email
     */
    @WebResult(name = "BasicResponse", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "IsUserExists")
    public BasicResponse isUserExists(
        @WebParam(partName = "facebookId", name = "facebookId", targetNamespace = "http://tempuri.org/")
        java.lang.String facebookId,
        @WebParam(partName = "email", name = "email", targetNamespace = "http://tempuri.org/")
        java.lang.String email
    );

    /**
     * Returns a list of user's contests
     */
    @WebResult(name = "BasicResponse", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "RenewFacebookAccessToken")
    public BasicResponse renewFacebookAccessToken(
        @WebParam(partName = "userId", name = "userId", targetNamespace = "http://tempuri.org/")
        java.lang.String userId,
        @WebParam(partName = "newAccessToken", name = "newAccessToken", targetNamespace = "http://tempuri.org/")
        java.lang.String newAccessToken
    );

    /**
     * Used for debug
     */
    @WebResult(name = "BasicResponse", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "Test")
    public BasicResponse test();

    /**
     * Obtains Contests-users table
     */
    @WebResult(name = "ArrayOfContestUser", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetListOfContestsUsers")
    public ArrayOfContestUser getListOfContestsUsers();

    /**
     * Returns a list of topics
     */
    @WebResult(name = "ArrayOfTopic", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetListOfTopics")
    public ArrayOfTopic getListOfTopics();

    /**
     * Returns a list of contests in which the user and his friends are **NOT** playing
     */
    @WebResult(name = "ArrayOfContest", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetListOfGlobalContests")
    public ArrayOfContest getListOfGlobalContests(
        @WebParam(partName = "userId", name = "userId", targetNamespace = "http://tempuri.org/")
        java.lang.String userId,
        @WebParam(partName = "offset", name = "offset", targetNamespace = "http://tempuri.org/")
        java.lang.String offset,
        @WebParam(partName = "count", name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count
    );

    /**
     * Adds a new user to database
     */
    @WebResult(name = "BasicResponse", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "AddFacebookUser")
    public BasicResponse addFacebookUser(
        @WebParam(partName = "accessToken", name = "accessToken", targetNamespace = "http://tempuri.org/")
        java.lang.String accessToken
    );

    /**
     * Adds a user to a contest
     */
    @WebResult(name = "BasicResponse", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "AddUserToContest")
    public BasicResponse addUserToContest(
        @WebParam(partName = "userId", name = "userId", targetNamespace = "http://tempuri.org/")
        java.lang.String userId,
        @WebParam(partName = "contestId", name = "contestId", targetNamespace = "http://tempuri.org/")
        java.lang.String contestId,
        @WebParam(partName = "itemId", name = "itemId", targetNamespace = "http://tempuri.org/")
        java.lang.String itemId
    );

    /**
     * Returns a list of user's friends contests
     */
    @WebResult(name = "ArrayOfContest", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetListOfUserFriendsContests")
    public ArrayOfContest getListOfUserFriendsContests(
        @WebParam(partName = "userId", name = "userId", targetNamespace = "http://tempuri.org/")
        java.lang.String userId,
        @WebParam(partName = "offset", name = "offset", targetNamespace = "http://tempuri.org/")
        java.lang.String offset,
        @WebParam(partName = "count", name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count
    );

    /**
     * Obtains Contests table
     */
    @WebResult(name = "ArrayOfContest", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetListOfContests")
    public ArrayOfContest getListOfContests();

    /**
     * Gets a random question from the DB and its answers. Adds +1 to the amount of times this question has been shown to the user
     */
    @WebResult(name = "Question", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetContestQuestion")
    public Question getContestQuestion(
        @WebParam(partName = "userId", name = "userId", targetNamespace = "http://tempuri.org/")
        java.lang.String userId,
        @WebParam(partName = "contestId", name = "contestId", targetNamespace = "http://tempuri.org/")
        java.lang.String contestId
    );

    /**
     * Returns information about a specific contest
     */
    @WebResult(name = "Contest", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetContestInfo")
    public Contest getContestInfo(
        @WebParam(partName = "contestId", name = "contestId", targetNamespace = "http://tempuri.org/")
        java.lang.String contestId
    );

    /**
     * Returns a list of user's contests
     */
    @WebResult(name = "ArrayOfContest", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetListOfUserContests")
    public ArrayOfContest getListOfUserContests(
        @WebParam(partName = "userId", name = "userId", targetNamespace = "http://tempuri.org/")
        java.lang.String userId,
        @WebParam(partName = "offset", name = "offset", targetNamespace = "http://tempuri.org/")
        java.lang.String offset,
        @WebParam(partName = "count", name = "count", targetNamespace = "http://tempuri.org/")
        java.lang.String count
    );

    /**
     * Sets an answer to a given question... updates needed tables in the DB
     */
    @WebResult(name = "BasicResponse", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "SetAnswer")
    public BasicResponse setAnswer(
        @WebParam(partName = "userId", name = "userId", targetNamespace = "http://tempuri.org/")
        java.lang.String userId,
        @WebParam(partName = "contestId", name = "contestId", targetNamespace = "http://tempuri.org/")
        java.lang.String contestId,
        @WebParam(partName = "questionId", name = "questionId", targetNamespace = "http://tempuri.org/")
        java.lang.String questionId,
        @WebParam(partName = "answerId", name = "answerId", targetNamespace = "http://tempuri.org/")
        java.lang.String answerId
    );

    /**
     * returns the log table. value '0' in limit is 'no limit'!
     */
    @WebResult(name = "ArrayOfLog", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetLogTable")
    public ArrayOfLog getLogTable();

    /**
     * Obtains Users table
     */
    @WebResult(name = "ArrayOfUser", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetListOfUsers")
    public ArrayOfUser getListOfUsers();
}
