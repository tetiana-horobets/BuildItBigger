package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static android.support.test.InstrumentationRegistry.getContext;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest  {
    @Test
    public void checkStringIsNotEmpty () {
        String joke;
        try {
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask();
            jokeTask.execute(new Pair<Context, String>(getContext(), ""));
            joke = jokeTask.get(30, TimeUnit.SECONDS);
            assertNotNull(joke);
        } catch (Exception e){
            fail("Timed out");
        }
    }
}
