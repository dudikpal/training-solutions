package collectionsqueue.collectionsdequeue;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class JobQueue {

    private Deque<Job> jobsDeque = new ArrayDeque<>();

    public Job dispatchUrgentJob(Deque<Job> jobs) throws NoJobException {
        emptyQueue(jobs);
        return jobs.pollFirst();
    }

    public Job dispatchNotUrgentJob(Deque<Job> jobs) throws NoJobException {
        emptyQueue(jobs);
        return jobs.pollLast();
    }

    private void emptyQueue(Deque<Job> jobs) throws NoJobException {
        if (jobs.size() == 0) {
            throw new NoJobException("No job available, get a rest!");
        }
    }

    public Deque<Job> addJobByUrgency(Job... jobs) {
        for (Job job: jobs) {
            if (job.getPriority() < 5) {
                jobsDeque.addFirst(job);
            } else {
                jobsDeque.addLast(job);
            }
        }
        return jobsDeque;
    }

    public Deque<Job> getJobs() {
        return new ArrayDeque<>(jobsDeque);
    }
}
