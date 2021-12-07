package com.jsikmc15.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.jsikmc15.helloworld.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private TextView tv_title;
    private Button btn_do;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //R 클래스에는 int 형 상수로 id 값이 다 정리되어 있음

        //1] findViewByID 로 매핑
        tv_title = (TextView) findViewById(R.id.txt_mainID);
        btn_do = findViewById(R.id.btn_do);

        //2] ViewBinding 을 이용하는 방법
        // Gradle 에서 viewBinding enable =true 로 바꿔준다.
        // ActivityMainBinding 객체를 생성
//        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
//        View view= mainBinding.getRoot();
//        setContentView(view);
//        tv_title = mainBinding.txtMainID;
//        btn_do = mainBinding.btnDo;



        btn_do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "버튼을 클릭했어요 !", Toast.LENGTH_SHORT).show();
                // 첫번째 파라미터는 Context 만 가져오면 다된다,
                //Toast.makeText(v.getContext(), "버튼을 클릭했어요 !",Toast.LENGTH_SHORT).show();
            }
        });


    }
}