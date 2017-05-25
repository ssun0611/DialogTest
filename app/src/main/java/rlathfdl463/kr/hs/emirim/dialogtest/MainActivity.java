package rlathfdl463.kr.hs.emirim.dialogtest;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] itemArr={"김성철", "윤용만", "서인후", "이해기","준","카인즈","토비아스","벤볼리오","황국열","정세훈","청순","사담","박상구"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butDialog=(Button) findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("해더니 남편 고르기");
        dialog.setIcon(R.drawable.tangguri);
        //dialog.setMessage("안녕? 나는 탕구리!");
        dialog.setItems(itemArr,null);
        dialog.setPositiveButton("안녕",null);
        dialog.setNegativeButton("저리가",null);
        dialog.show();

    }
}
