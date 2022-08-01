package ss3_oop.exercise;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public StopWatch() {
        startTime = new Date();
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}


