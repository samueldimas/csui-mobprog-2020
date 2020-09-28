package id.ac.ui.cs.mobileprogramming.helloworld;

import android.view.View;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity myActivity = null;

    @Before
    public void setUp() throws Exception {
        myActivity = rule.getActivity();
    }

    @Test
    public void testActivity() {
        View view = myActivity.findViewById(R.id.toolbar);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        myActivity = null;
    }
}
