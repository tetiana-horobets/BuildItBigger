package com.udacity.gradle.builditbigger.paid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidjoke.JokeActivity;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.R;

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button tellJoke = view.findViewById(R.id.tellJoke);

        tellJoke.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity().getApplicationContext(), JavaJokes.getJoke(), Toast.LENGTH_SHORT).show();
                @SuppressLint("StaticFieldLeak") EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(){
                    protected void onPostExecute(String result){
                        Intent intent = new Intent(getContext(), JokeActivity.class);
                        intent.putExtra( "joke_key", result);
                        startActivity(intent);
                    }
                };
                endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), ""));
            }
        });
    }
}