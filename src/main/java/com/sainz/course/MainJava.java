package com.sainz.course;

import java.util.ArrayList;
import java.util.Scanner;

public class MainJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Course newCourse;

        ArrayList<Course> courses = new ArrayList<>();


        for (int i = 1; i <= 5; i++)
        {
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

        }
        for (Course eachCourse : courses)

        {
            System.out.println("========");
            System.out.println("Course number:" + " " + eachCourse.getCourseNumber());
            System.out.print("Course contents:" + " " + eachCourse.toString());
        }

    }
}
