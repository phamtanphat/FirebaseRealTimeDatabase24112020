package com.example.firebaserealtimedatabase24112020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Gửi dữ liệu
        // 1 : Kiểu string

        // Android24112020 : 10 bạn
//        myRef.child("Android24112020").setValue("10 bạn").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thêm dữ liệu thành công", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        // 2 : Kiểu object
        // Phuongtien
            // ten : xe dap
            // sobanh : 2 bánh
        Phuongtien xedap = new Phuongtien("xe đạp" , 2);
        myRef.child("Phuongtien").setValue(xedap).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Thêm dữ liệu thành công", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 3 : Kiểu list object

        // Message
        // sadqw2132313-ưqe2133
        // text : "Xin chào"
        // time : "192021311"

//        myRef.child("Message")
//                .push()
//                .setValue(new Message("Tôi tên là phát",System.currentTimeMillis()))
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        if (task.isSuccessful()){
//                            Toast.makeText(MainActivity.this, "Thêm dữ liệu thành công", Toast.LENGTH_SHORT).show();
//                        }else{
//                            Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });

    }
}