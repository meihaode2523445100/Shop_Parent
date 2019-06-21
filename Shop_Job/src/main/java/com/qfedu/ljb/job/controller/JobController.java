package com.qfedu.ljb.job.controller;

import org.quartz.SchedulerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {


    @GetMapping("job/start.do")
    public String start(String cron) throws SchedulerException {
//        Trigger trigger=TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule(cron)).build();
//        JobDetail jobDetail=JobBuilder.newJob(StudyJob.class).build();
//        scheduler.scheduleJob(jobDetail,trigger);
        return "OK";
    }
}
