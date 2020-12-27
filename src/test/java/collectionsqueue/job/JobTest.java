package collectionsqueue.job;

import collectionsqueue.collectionspriorityqueue.JobDispatcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    private Job[] jobs = {new Job(2, "job1"), new Job(7, "job2"), new Job(5, "job3")};;
    private JobDispatcher jdp;
    private Queue<Job> jobsQueue;

    @BeforeEach
    void setUp() {
        jdp = new JobDispatcher();
        jdp.addJob(jobs);

    }

    @Test
    void testCreateJob() {
        assertEquals(3, jdp.getJobsQueue().size());
        assertTrue(jdp.getJobsQueue().poll().isUrgent());
    }

    @Test
    void testPriority() {
        try {
            assertEquals(2, jdp.dispatchNextJob(jdp.getJobsQueue()).getPriority());
            assertEquals(5, jdp.dispatchNextJob(jdp.getJobsQueue()).getPriority());
            assertEquals(7, jdp.dispatchNextJob(jdp.getJobsQueue()).getPriority());

        } catch (NoJobException nje) {
            if ( jobs == null || jobs.length == 0) {
                throw new IllegalArgumentException("The queue is empty");
            }
        }
    }

    @Test
    void testEmptyArgument() {
        Exception ex = assertThrows(NoJobException.class, () -> jdp.dispatchNextJob(new PriorityQueue<>()));
    }

}