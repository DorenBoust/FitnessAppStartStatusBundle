package com.example.fitnessapp.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fitnessapp.R;
import com.example.fitnessapp.keys.KeysUserFragment;
import com.example.fitnessapp.user.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StatusFragment extends Fragment {

    private StatusViewModel mViewModel;
    private User user;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.status_fragment, container, false);

        user = (User) getArguments().getSerializable(KeysUserFragment.USER_DATA_TO_FRAGMENT);

        System.out.println("Live Data Status " + user);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(StatusViewModel.class);
        // TODO: Use the ViewModel
    }

}
