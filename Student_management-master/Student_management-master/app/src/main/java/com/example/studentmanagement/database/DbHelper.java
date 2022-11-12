package com.example.studentmanagement.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(@Nullable Context context) {
        super(context,"QLSinhVien2", null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlSVCreate = "CREATE TABLE IF NOT EXISTS " +
                " SinhVien(MaSV INTEGER PRIMARY KEY AUTOINCREMENT," +
                "HoTen VARCHAR(200)," +
                "GioiTinh INTEGER," +
                "DienThoai VARCHAR(13)," +
                "Email VARCHAR(50))";
        sqLiteDatabase.execSQL(sqlSVCreate);

        String sqlInsertSV = "INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) " +
                " values ('Do Tan Tu','1','0775543227','tudo7868@gmail.com')," +
                        "('Do Tan Tu','1','0775543227','tudo7868@gmail.com')," +
                        "('Pham Ngoc Tan','1','0975543286','tanpham2002@gmail.com')," +
                        "('Le Van Thang','0','0985543213','levanthang@gmail.com')," +
                        "('Ho Thi Ai Thi','0','0962543332','aithiho@gmail.com')," +
                        "('Vu Dinh Thang','1','0705543143','dinhthangvu@gmail.com')," +
                        "('Le Thuan Phuc','1','0950543860','lethuanphuc@gmail.com')" ;
        sqLiteDatabase.execSQL(sqlInsertSV);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
