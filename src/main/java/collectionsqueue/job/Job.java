package collectionsqueue.job;

import collectionsqueue.collectionspriorityqueue.JobDispatcher;

public class Job implements Comparable<Job>{

    private final int priority;
    private final String jobDescription;
    private final boolean urgent;

    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
        urgent = priority < 5 ? true : false;
    }

    @Override
    public int compareTo(Job job) {
        return priority - job.priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public static void main(String[] args) {
        JobDispatcher jdp = new JobDispatcher();
        Job[] jobs = {new Job(2, "job1"), new Job(7, "job2"), new Job(5, "job3")};;
        jdp.addJob(jobs);
        Job job = null;
        while (jdp.getJobsQueue().size() > 0){
            job = jdp.getJobsQueue().poll();
            System.out.println(job);
        }

    }

    @Override
    public String toString() {
        return "Job{" +
                "priority=" + priority +
                ", jobDescription='" + jobDescription + '\'' +
                ", urgent=" + urgent +
                "}\n";
    }
}
