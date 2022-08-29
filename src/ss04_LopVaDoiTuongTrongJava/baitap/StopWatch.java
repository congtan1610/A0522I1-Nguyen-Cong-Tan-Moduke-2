package ss04_LopVaDoiTuongTrongJava.baitap;

import java.util.Scanner;

public class StopWatch {
    long startTime, endTime;
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long timelapse() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start: ");
        long start = scanner.nextLong();
        System.out.print("Enter end: ");
        long end = scanner.nextLong();
        StopWatch stopwatch = new StopWatch();
        stopwatch.setStartTime(start);
        stopwatch.setEndTime(end);
        System.out.print("Timlapse: " + stopwatch.timelapse());
    }
}


