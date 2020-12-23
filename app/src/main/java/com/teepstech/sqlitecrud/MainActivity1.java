/*package com.teepstech.sqlitecrud;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {
    DatabaseHelper db;
    EditText e1,e2,e3;
        Button b1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login_session);
            db = new DatabaseHelper(this);
            e1=(EditText)findViewById(R.id.email);
            e2=(EditText)findViewById(R.id.pass);
            e3=(EditText)findViewById(R.id.cpass);
            b1=(Button) findViewById(R.id.register);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s1= e1.getText().ToSring();
                    String s2= e2.getText().ToSring();
                    String s3= e3.getText().ToSring();
                    if (s1.equals("") || s2.equals("") || s3.equals("")) {
                        Toast.makeText(getApplicationContext, "Fields are empty", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if (s2.equals(s3)) {
                            boolean chkemail==true
                        }
                    }
                }
            });




        }
}
*/
