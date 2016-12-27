package com.example.user1.sb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user1 on 2016/12/18.
 */

public class SB_GamePlay extends AppCompatActivity {
    private Button Pause_Btn,Home_Btn,information_btn;
    private  String informationText ="    遊戲玩法:    \n    在奶茶喝完之前  \n    盡力吸完所有珍珠  \n    按住吸按鍵可以開始吸    \n    移動吸管去吸珍珠";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sb_gameview);
        information_btn =(Button) findViewById(R.id.information_btn);
        information_btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), informationText, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();//information of game
                //Toast.makeText(v.getContext(), informationText, Toast.LENGTH_LONG).show();

            }
        });
    }
}
