package PointOfEntry;

import UserInterface.DataForLogin;
import UserInterface.WindowLogin;

public class Main {

    public static void main(String[] args) {

        DataForLogin dataForLogin = new DataForLogin();
        new WindowLogin(dataForLogin.getLoginInfo());

    }
}