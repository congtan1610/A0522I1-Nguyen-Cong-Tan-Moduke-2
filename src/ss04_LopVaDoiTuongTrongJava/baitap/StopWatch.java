package ss04_LopVaDoiTuongTrongJava.baitap;

import java.util.Date;

public class StopWatch {
    private Date startTime = new Date();
    private Date endTime = new Date();

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public StopWatch() {
    }
    public long start() {
        return this.startTime.getTime();
    }
    public long stop(){
        return this.endTime.getTime();
    }
    public long getElapsedTime(){
        return this.stop()-this.start();
    }
}
class MainStopWatch{
    public static void main(String[] args) {
        StopWatch Ob=new StopWatch();
        Ob.start();
        Ob.stop();
        System.out.println(""+Ob.getElapsedTime());
    }
}
