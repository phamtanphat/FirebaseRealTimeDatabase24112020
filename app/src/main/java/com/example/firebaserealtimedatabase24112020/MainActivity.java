package com.example.firebaserealtimedatabase24112020;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.firebaserealtimedatabase24112020.Message;

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
//        Phuongtien xedap = new Phuongtien("xe đạp" , 2);
//        myRef.child("Phuongtien").setValue(xedap).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thêm dữ liệu thành công", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

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

        // Đọc dữ liệu
//        myRef.child("Android24112020").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                String value = (String) snapshot.getValue();
//                Toast.makeText(MainActivity.this, value , Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });

//        myRef.child("Phuongtien").addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                HashMap<String,String> hashMap = (HashMap<String, String>) snapshot.getValue();
//                Iterator iterator = hashMap.entrySet().iterator();

//                while (iterator.hasNext()){
//                    Map.Entry entry = (Map.Entry) iterator.next();
//                    Log.d("BBB",entry.getKey().toString());
//                    Log.d("BBB",entry.getValue().toString());
//                    iterator.remove();
//                }
//                Phuongtien phuongtien = snapshot.getValue(Phuongtien.class);
//                Toast.makeText(MainActivity.this, phuongtien.toString(), Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });

        myRef.child("Message").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Message message = snapshot.getValue(Message.class);
                Toast.makeText(MainActivity.this, message.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}