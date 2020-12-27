package collectionsqueue.collectionspriorityqueue;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;

import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {

    private PriorityQueue<Job> jobsQueue = new PriorityQueue<>();

    public Job dispatchNextJob(Queue<Job> jobs) throws NoJobException {
        if (jobs.size() == 0) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobsQueue.poll();
    }

    public Queue<Job> addJob(Job... jobs) {
        for (Job job: jobs) {
            jobsQueue.add(job);
        }
        return jobsQueue;
    }

    public PriorityQueue<Job> getJobsQueue() {
        return new PriorityQueue<>(jobsQueue);
    }
}
