package com.bipindev.JobApplication.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void createJob(Job job);

}
