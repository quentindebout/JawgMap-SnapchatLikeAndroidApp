package com.littlebiig.snapchat;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class mapFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//      return super.onCreateView(name, context, attrs);
        return inflater.inflate(R.layout.map, null, false);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState ){
        super.onViewCreated(view, savedInstanceState);


        };

    }

