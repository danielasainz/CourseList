package com.sainz.course;

import java.util.ArrayList;
import java.util.Scanner;

public class MainJava {
    public static void main(String[] args) {
        boolean done = false;
        Scanner scan = new Scanner(System.in);
        String option;
        Course newCourse;


        ArrayList<Course> courses = new ArrayList<>();

            do {
                //make sure to include this in the do loop (see below)
                newCourse = new Course();
                System.out.println("Enter your course number");
                newCourse.setCourseNumber(scan.nextLine());
                System.out.println("Enter your course name");
                newCourse.setCourseName(scan.nextLine());
                System.out.println("Enter your room number");
                newCourse.setRoomNumber(scan.nextLine());
                System.out.println("Enter your semester (Fall or Spring)");
                newCourse.setCourseSemester(scan.nextLine());
                System.out.println("Enter your year");
                newCourse.setCourseYear(scan.nextLine());

                courses.add(newCourse);

                System.out.println("Do you want to enter the details for another course? (Y/N)");
                option = scan.nextLine();
                if (!option.equalsIgnoreCase("y")) {
                    done = false;
                } else {
                    done = true;
                }


            } while(done);

            for (Course eachCourse : courses)

            {

                System.out.println("========");
                System.out.println("Course number:" + " " + eachCourse.getCourseNumber());
                System.out.print("Course contents:" + " " + eachCourse.toString());
            }
        }
}



