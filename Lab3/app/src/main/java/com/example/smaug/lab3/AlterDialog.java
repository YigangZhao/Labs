package com.example.smaug.lab3;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class AlterDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter_dialog);
        showDialog(AlterDialog.this);
    }

    private void showDialog(Context context) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View alterDialogView = layoutInflater.inflate(R.layout.activity_alter_dialog, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Andorid app");
        builder.setView(alterDialogView);

        builder.setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //do someThing
                ;
            }
        });
        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //do someThing
                ;
            }
        });
        builder.show();
    }
}
