package org.csystem.classworks.lambda.app;

import org.csystem.util.scheduler.Scheduler;
import org.csystem.util.scheduler.function.IRunnable;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Alarm {
    private final Scheduler m_scheduler;
    private final LocalTime m_time;

    private void scheduleCallback(Runnable periodTask)
    {
        if (periodTask != null)
            periodTask.run();

        LocalTime now = LocalTime.now();

        now = now.withNano(0);

        if (m_time.equals(now))
            m_scheduler.cancel();
    }

    public Alarm(int hour, int minute)
    {
        this(hour, minute, 0);
    }

    public Alarm(int hour, int minute, int second)
    {
        this(LocalTime.of(hour, minute, second));
    }

    public Alarm(LocalTime time)
    {
        m_time = time;
        m_scheduler = new Scheduler(1, TimeUnit.SECONDS);
    }

    public Alarm start(Runnable alarmTask)
    {
        return start(alarmTask, null);
    }

    public Alarm start(Runnable alarmTask, Runnable periodTask)
    {
        m_scheduler.schedule((IRunnable) () -> scheduleCallback(periodTask), (IRunnable) alarmTask);

        return this;
    }
}