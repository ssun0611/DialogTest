package rlathfdl463.kr.hs.emirim.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static rlathfdl463.kr.hs.emirim.dialogtest.R.id.but_dialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String[] itemArr = {"김성철", "윤용만", "서인후", "이해기"};
    Button butDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog = (Button) findViewById(but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("세젤잘 고르기");
        dialog.setIcon(R.drawable.tangguri);
        //dialog.setMessage("안녕? 나는 탕구리!");
        /*dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                butDialog.setText(itemArr[i]);
                Toast.makeText(getApplicationContext(), "철컹쓰 뽀에버.", Toast.LENGTH_SHORT).show();
            }
        }); */

        //라디오 버튼 목록
       /* dialog.setSingleChoiceItems(itemArr,0,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                butDialog.setText(itemArr[i]);
            }
        });*/
        //체크 박스 목록
        // 선택 여부 배열
        boolean[] checkedItems = {true, false, true, false};
        dialog.setMultiChoiceItems(itemArr, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i, boolean b) {
                butDialog.setText(itemArr[i]);
            }
        });
        dialog.show();
    }
}
      //  dialog.setPositiveButton("지구 뿌셔 철컹철컹",null);

        //dialog.show();

