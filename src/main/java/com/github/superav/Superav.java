package com.github.superav;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Superav {
public static void main(String[] args) throws Exception {
    String startMes =
   "\n ----------------------------------------- \n"
 + "|  Super Antivirus for DOS16/WIN32/Java  ||\n"
 + "|         Version 1.0 build 023          ||  javadev75@gmail.com\n"
 + " ========================================= \n\n";

//    memset(BU,0,sizeof(BUFFER));

    java.io.PrintStream ps = new java.io.PrintStream(System.out, true, "UTF-8");
    ps.println(startMes);
    Logger.getLogger(Superav.class.getName()).log(Level.INFO, startMes);

}
}
