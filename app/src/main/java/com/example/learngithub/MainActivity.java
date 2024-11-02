package com.example.learngithub;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        /**
         * +++ git checkout -b dang-ky:
         * - git checkout -b là để tạo nhánh mới và checkout qua nhánh mới luôn
         * thay vì 2 thao tác là phải tạo rồi mwois checkout
         * +++ git add . : để lưu tất cả các thay đổi vào stagging area(vùng chuẩn bị commit)
         * +++ git commit -m "mô tả commit": -m là để viết mô tả commit ở trong cặp "" luôn
         * nếu không có -m mà chỉ viết git commit thì git sẽ mở hộp thoại nhập mô tả commit
         * vì git bắt buộc ng dùng nhập mô tả commit
         * +++ git push-u origin dang-ky:
         * '-u' : điều này sẽ khiến git ghi nhớ rằng nhánh ở local liên kết chặn với nhánh
         * ở trên git(repo từ xa)
         * - origin: ở đây là origin là tên, hiểu đơn giản thì origin giống như 1 Folder remote
         * trên git, trong đó có các file là các nhánh, như nhánh main, nhánh phụ là các chức năng
         *
         */
    }
}