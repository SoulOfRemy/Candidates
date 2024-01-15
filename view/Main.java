package view;

import controller.controller;

public class Main
{
    public static void main(String[] args)
    {
        String title = "Manage Candidate Of Company File";
        String[] s = new String[]{"Experience", "Fresher", "Intern", "Searching", "Exit"};
        controller controller = new controller(title, s);
        controller.run();
    }
    
}