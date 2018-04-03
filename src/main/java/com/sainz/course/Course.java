package com.sainz.course;

public class Course {
    private String courseNumber;
    private String courseName;
    private String roomNumber;
    private String courseSemester;
    private String courseYear;


    @Override
    public String toString() {
        return "Course Number: " + courseNumber + " " + "Course Name: " + courseName + " " + "Room Number: "
        + roomNumber + " " + "Course Semester: " + courseSemester + " " + "Course Year: " + courseYear;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCourseSemester() {
        return courseSemester;
    }

    public void setCourseSemester(String courseSemester) {
        this.courseSemester = courseSemester;
    }

    public String getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(String courseYear) {
        this.courseYear = courseYear;
    }
}
