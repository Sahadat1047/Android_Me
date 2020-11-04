/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        BodyPartFragment headFragment= new BodyPartFragment();


        headFragment.setImageIds(AndroidImageAssets.getHeads());
        headFragment.setListIndex(1);

        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().
                add(R.id.head_Container,headFragment).
                commit();

        BodyPartFragment bodyFragment= new BodyPartFragment();
        bodyFragment.setListIndex(2);
        bodyFragment.setImageIds(AndroidImageAssets.getBodies());
        fragmentManager.beginTransaction().
                add(R.id.body_Container,bodyFragment).
                commit();

        BodyPartFragment tailFragment= new BodyPartFragment();
        tailFragment.setListIndex(3);
        tailFragment.setImageIds(AndroidImageAssets.getLegs());
        fragmentManager.beginTransaction().
                add(R.id.Tail_Container,tailFragment).
                commit();
    }
}
