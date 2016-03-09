package appewtc.masterung.weightcheck;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 2/3/16 AD.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String table_user = "userTABLE";
    public static final String table_weight = "weightTABLE";
    public static final String column_id = "_id";
    public static final String column_user = "User";
    public static final String column_password = "Password";
    public static final String column_name = "Name";
    public static final String column_date = "Date";
    public static final String column_weight = "Weight";

    public MyManage(Context context) {

        //Create & Connected
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    }   // Constructor

    //Add New Value to userTABLE
    public long addUserTable(String strUser, String strPassword, String strName) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_user, strUser);
        objContentValues.put(column_password, strPassword);
        objContentValues.put(column_name, strName);

        return writeSqLiteDatabase.insert(table_user, null, objContentValues);
    }


}   // Main Class
