/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.coder80.switchview;
import android.os.Bundle;
import android.app.Activity;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MySwitchView s = (MySwitchView) findViewById(R.id.my_switch);
        if (s != null) {
            s.setOnCheckedChangeListener(this);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String str = "";
        if(isChecked){
            str = this.getString(R.string.capital_on);
        }else{
            str = this.getString(R.string.capital_off);
        }
       Toast.makeText(this, str,Toast.LENGTH_SHORT).show();
    }

}
