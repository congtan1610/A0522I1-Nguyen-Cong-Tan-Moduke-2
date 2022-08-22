package ss04_LopVaDoiTuongTrongJava.baitap;

import java.util.Date;

public class StopWatch {
    private Date startTime = new Date();
    private Date endTime = new Date();

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
    }

    public Date start() {
        return startTime;
    }
}
