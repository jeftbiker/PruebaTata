package co.com.tata.prueba.model;

import java.util.HashMap;
import java.util.Map;

public class DemoblaeData {
    private String strname,strpass, strEmail,strContactName,strMessage;

    private static Map<String,Object> responseUser=new HashMap<>();
    private static Map<String,Object> responseCart=new HashMap<>();


    public String getStrname() {
        return strname;
    }

    public void setStrname(String strname) {
        this.strname = strname;
    }

    public String getStrpass() {
        return strpass;
    }

    public void setStrpass(String strpass) {
        this.strpass = strpass;
    }

    public static Map<String, Object> getResponseUser() {
        return responseUser;
    }

    public static void setResponseUser(Map<String, Object> responseUser) {
        DemoblaeData.responseUser = responseUser;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrContactName() {
        return strContactName;
    }

    public void setStrContactName(String strContactName) {
        this.strContactName = strContactName;
    }

    public String getStrMessagw() {
        return strMessage;
    }

    public void setStrMessagw(String strMessagw) {
        this.strMessage = strMessagw;
    }

    public static Map<String, Object> getResponseCart() {
        return responseCart;
    }

    public static void setResponseCart(Map<String, Object> responseCart) {
        DemoblaeData.responseCart = responseCart;
    }
}
