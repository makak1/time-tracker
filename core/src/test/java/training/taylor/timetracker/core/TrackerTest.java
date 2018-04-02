package training.taylor.timetracker.core;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import training.taylor.timetracker.core.dao.TimeEntry;

/**
 * Created by Jason on 6/19/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerTest {
    @Autowired
    private Tracker tracker;
    int n=0;
    @Test
    public void testMe() {
        assertNotNull(tracker);
    }

    @Test
    public void testAdd() throws Exception 
{
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(80.0f);
        entry.setTime(3);
        tracker.add(entry);
        int j= 10/n;
        assertTrue(tracker.size() > 0);
    }
}
