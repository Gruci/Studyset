package com.example.joan.androidcomplete;

import android.Manifest;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Joan on 2016-10-08.
 */

public class PerExam extends AppCompatActivity {
    TextView mResult;
    final int READ_CONTACT_CODE = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.per_exam);
        mResult = (TextView)findViewById(R.id.result);
    }

    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.btnread:
                tryOutContact();
                break;
            case R.id.btnreset:
                mResult.setText("주소록");
                break;
        }
    }

    void tryOutContact() {
        if(ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_CONTACTS) == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "허가된 상태",
                    Toast.LENGTH_SHORT).show();
            outContact();
        } else  {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.READ_CONTACTS)) {
                new AlertDialog.Builder(this)
                        .setMessage("이 프로그램이 동작하기 위해서" +
                        "필수적으로 동의해 주셔야 합니다.")
                        .setTitle("부디...")
                        .setPositiveButton("예",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                ActivityCompat.requestPermissions(PerExam.this,
                                        new String[]{Manifest.permission.READ_CONTACTS},
                                        READ_CONTACT_CODE);
                            }
                        })
                        .setNegativeButton("아니오",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                            }
                        })
                        .show();
            } else{
                Toast.makeText(this, "허가된 상태가 아니어서 퍼미션 요청",
                        Toast.LENGTH_SHORT).show();
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.READ_CONTACTS},READ_CONTACT_CODE);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case READ_CONTACT_CODE:
                if (grantResults.length > 0 && grantResults[0] ==
                        PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "사용자가 퍼미션 허가함",
                            Toast.LENGTH_SHORT).show();
                    outContact();
                } else {
                    Toast.makeText(this, "사용자가 퍼미션 거부함",
                            Toast.LENGTH_SHORT).show();
                    //todo: 다른대책 or ERROR 처리
                }
        }
    }

    void outContact() {
        ContentResolver cr = getContentResolver();
        Cursor cursor = cr.query(
                ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        int nameidx = cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);

        if(cursor.moveToNext()) {
            mResult.setText(cursor.getString(nameidx));
        } else {
            mResult.setText("주소록이 비어있습니다");
        }
        cursor.close();
    }
}
