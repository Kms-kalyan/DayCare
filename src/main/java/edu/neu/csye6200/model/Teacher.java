package edu.neu.csye6200.model;


import edu.neu.csye6200.util.DateUtil;
import java.util.Date;


public class Teacher extends Person{
    private int credits;
    private Date reviewDate;
    private int teacherId;
    public Teacher( String firstName, String lastName, int age, int credits,
                    Date reviewDate) {
        super(firstName,lastName, age);
        this.credits = credits;
        this.reviewDate = reviewDate;
    }

    public Teacher( String data) {
        super(data);
        String[] parsedTeacherData = data.split(",");
        setCredits(Integer.parseInt(parsedTeacherData[3]));
        setReviewDate(DateUtil.parseStringToDate(parsedTeacherData[4], "MM/dd/yyyy"));
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
    
    public Date getReviewDate() {
        return reviewDate;
    }
    
    public void setTeacherId() {
        this.teacherId = teacherId + 100;
    }
    public int getTeacherId() {
        return teacherId;
    }
}
