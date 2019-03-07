package oop;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }


    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        for (int i = 0 ; i < 100000; i++) {
            System.out.println(i);
        }
        watch.stop();
        System.out.println("Time for executing: " + watch.getElapsedTime() + " from " + watch.getStartTime() + " to " + watch.getEndTime());
    }



    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
