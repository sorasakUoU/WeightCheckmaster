package appewtc.masterung.weightcheck;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 2/3/16 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper{


    //Explicit
    public static final String database_name = "Weight.db"; //ประกาศค่าคงที่ ทีี่ไม่สามารถแก้ไขได้
    private static final int database_version = 1;
    private static final String create_table_weight = "create table weightTABLE (" +
            "_id integer primary key, " +
            "Date text, " +
            "Weight text);";

    private static final String create_table_user = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text, " +
            "Password text, " +
            "Name text);";



    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_table_weight);
        sqLiteDatabase.execSQL(create_table_user);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
