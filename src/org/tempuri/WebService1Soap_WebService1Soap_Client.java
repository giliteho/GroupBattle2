
package org.tempuri;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.jinouts.xml.namespace.QName;
import org.jinouts.jws.WebMethod;
import org.jinouts.jws.WebParam;
import org.jinouts.jws.WebResult;
import org.jinouts.jws.WebService;
import org.jinouts.xml.bind.annotation.XmlSeeAlso;
import org.jinouts.xml.ws.RequestWrapper;
import org.jinouts.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-10-29T19:36:31.826+02:00
 * Generated source version: 2.6.2
 * 
 */
public final class WebService1Soap_WebService1Soap_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "WebService1");

    private WebService1Soap_WebService1Soap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WebService1.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        WebService1 ss = new WebService1(wsdlURL, SERVICE_NAME);
        WebService1Soap port = ss.getWebService1Soap();  
        
        {
        System.out.println("Invoking addNewContest...");
        int _addNewContest_userId = 0;
        java.lang.String _addNewContest_contestItem1 = "";
        java.lang.String _addNewContest_contestItem2 = "";
        java.lang.String _addNewContest_contestItem3 = "";
        int _addNewContest_topicId = 0;
        int _addNewContest_durationInHours = 0;
        org.tempuri.BasicResponse _addNewContest__return = port.addNewContest(_addNewContest_userId, _addNewContest_contestItem1, _addNewContest_contestItem2, _addNewContest_contestItem3, _addNewContest_topicId, _addNewContest_durationInHours);
        System.out.println("addNewContest.result=" + _addNewContest__return);


        }
        {
        System.out.println("Invoking getContestTopPlayers...");
        int _getContestTopPlayers_contestId = 0;
        int _getContestTopPlayers_amountOfPlayers = 0;
        org.tempuri.ArrayOfContestUser _getContestTopPlayers__return = port.getContestTopPlayers(_getContestTopPlayers_contestId, _getContestTopPlayers_amountOfPlayers);
        System.out.println("getContestTopPlayers.result=" + _getContestTopPlayers__return);


        }
        {
        System.out.println("Invoking isUserExists...");
        java.lang.String _isUserExists_facebookId = "";
        java.lang.String _isUserExists_email = "";
        org.tempuri.BasicResponse _isUserExists__return = port.isUserExists(_isUserExists_facebookId, _isUserExists_email);
        System.out.println("isUserExists.result=" + _isUserExists__return);


        }
        {
        System.out.println("Invoking renewFacebookAccessToken...");
        int _renewFacebookAccessToken_userId = 0;
        java.lang.String _renewFacebookAccessToken_newAccessToken = "";
        org.tempuri.BasicResponse _renewFacebookAccessToken__return = port.renewFacebookAccessToken(_renewFacebookAccessToken_userId, _renewFacebookAccessToken_newAccessToken);
        System.out.println("renewFacebookAccessToken.result=" + _renewFacebookAccessToken__return);


        }
        {
        System.out.println("Invoking test...");
        org.tempuri.BasicResponse _test__return = port.test();
        System.out.println("test.result=" + _test__return);


        }
        {
        System.out.println("Invoking getListOfContestsUsers...");
        org.tempuri.ArrayOfContestUser _getListOfContestsUsers__return = port.getListOfContestsUsers();
        System.out.println("getListOfContestsUsers.result=" + _getListOfContestsUsers__return);


        }
        {
        System.out.println("Invoking getListOfTopics...");
        org.tempuri.ArrayOfTopic _getListOfTopics__return = port.getListOfTopics();
        System.out.println("getListOfTopics.result=" + _getListOfTopics__return);


        }
        {
        System.out.println("Invoking getListOfGlobalContests...");
        int _getListOfGlobalContests_userId = 0;
        int _getListOfGlobalContests_offset = 0;
        int _getListOfGlobalContests_count = 0;
        org.tempuri.ArrayOfContest _getListOfGlobalContests__return = port.getListOfGlobalContests(_getListOfGlobalContests_userId, _getListOfGlobalContests_offset, _getListOfGlobalContests_count);
        System.out.println("getListOfGlobalContests.result=" + _getListOfGlobalContests__return);


        }
        {
        System.out.println("Invoking addFacebookUser...");
        java.lang.String _addFacebookUser_accessToken = "";
        org.tempuri.BasicResponse _addFacebookUser__return = port.addFacebookUser(_addFacebookUser_accessToken);
        System.out.println("addFacebookUser.result=" + _addFacebookUser__return);


        }
        {
        System.out.println("Invoking addUserToContest...");
        int _addUserToContest_userId = 0;
        int _addUserToContest_contestId = 0;
        int _addUserToContest_itemId = 0;
        org.tempuri.BasicResponse _addUserToContest__return = port.addUserToContest(_addUserToContest_userId, _addUserToContest_contestId, _addUserToContest_itemId);
        System.out.println("addUserToContest.result=" + _addUserToContest__return);


        }
        {
        System.out.println("Invoking getListOfUserFriendsContests...");
        int _getListOfUserFriendsContests_userId = 0;
        int _getListOfUserFriendsContests_offset = 0;
        int _getListOfUserFriendsContests_count = 0;
        org.tempuri.ArrayOfContest _getListOfUserFriendsContests__return = port.getListOfUserFriendsContests(_getListOfUserFriendsContests_userId, _getListOfUserFriendsContests_offset, _getListOfUserFriendsContests_count);
        System.out.println("getListOfUserFriendsContests.result=" + _getListOfUserFriendsContests__return);


        }
        {
        System.out.println("Invoking getListOfContests...");
        org.tempuri.ArrayOfContest _getListOfContests__return = port.getListOfContests();
        System.out.println("getListOfContests.result=" + _getListOfContests__return);


        }
        {
        System.out.println("Invoking getContestQuestion...");
        int _getContestQuestion_userId = 0;
        int _getContestQuestion_contestId = 0;
        org.tempuri.Question _getContestQuestion__return = port.getContestQuestion(_getContestQuestion_userId, _getContestQuestion_contestId);
        System.out.println("getContestQuestion.result=" + _getContestQuestion__return);


        }
        {
        System.out.println("Invoking getContestInfo...");
        int _getContestInfo_contestId = 0;
        org.tempuri.Contest _getContestInfo__return = port.getContestInfo(_getContestInfo_contestId);
        System.out.println("getContestInfo.result=" + _getContestInfo__return);


        }
        {
        System.out.println("Invoking getListOfUserContests...");
        int _getListOfUserContests_userId = 0;
        int _getListOfUserContests_offset = 0;
        int _getListOfUserContests_count = 0;
        org.tempuri.ArrayOfContest _getListOfUserContests__return = port.getListOfUserContests(_getListOfUserContests_userId, _getListOfUserContests_offset, _getListOfUserContests_count);
        System.out.println("getListOfUserContests.result=" + _getListOfUserContests__return);


        }
        {
        System.out.println("Invoking setAnswer...");
        int _setAnswer_userId = 0;
        int _setAnswer_contestId = 0;
        int _setAnswer_questionId = 0;
        int _setAnswer_answerId = 0;
        org.tempuri.BasicResponse _setAnswer__return = port.setAnswer(_setAnswer_userId, _setAnswer_contestId, _setAnswer_questionId, _setAnswer_answerId);
        System.out.println("setAnswer.result=" + _setAnswer__return);


        }
        {
        System.out.println("Invoking getLogTable...");
        org.tempuri.ArrayOfLog _getLogTable__return = port.getLogTable();
        System.out.println("getLogTable.result=" + _getLogTable__return);


        }
        {
        System.out.println("Invoking getListOfUsers...");
        org.tempuri.ArrayOfUser _getListOfUsers__return = port.getListOfUsers();
        System.out.println("getListOfUsers.result=" + _getListOfUsers__return);


        }

        System.exit(0);
    }

}
