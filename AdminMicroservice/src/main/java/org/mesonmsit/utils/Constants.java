package org.mesonmsit.utils;

public class Constants {

    /**
     * General Used
     */
    public static final String success = "SUCCESS";
    public static final String failure = "FAILURE";
    public static final String forbidden = "Forbidden";

    /**
     * The following constants are passed as variables from the calling module
     * (e.g. API Gateway, Lambda environment variable, CloudWatch event
     * variable, etc.) Most of them can be found under the JSON object named
     * "stageVariables". The values of the constants here indicate the JSON
     * object name to use to fetch the value
     */
    public static String DBLINK = "";
    public static String DBUSER = "";
    public static String DBPASS = "";
    public static String LOG_LEVEL = "";
    public static String LAMBDA_ALIAS = "";
    
}
