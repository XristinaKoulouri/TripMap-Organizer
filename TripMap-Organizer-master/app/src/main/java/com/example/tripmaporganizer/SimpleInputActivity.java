package com.example.tripmaporganizer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextLinks;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;


public class SimpleInputActivity extends AppCompatActivity {
    EditText edt;
    Button button_request;
    TextView tv;
    String result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_input);

        //extract components from screen
        edt = (EditText) findViewById(R.id.editText);
        button_request = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView3);
        tv.setVisibility(View.GONE);

        button_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create http request
                //result = jsonObject(Connection.makeHttpRequest(edt.getText().toString()));
                OkHttpClient client = new OkHttpClient();
                String url = "";
                //Request req = new Request().newBuilder().url("").build();

                //After HTTP request
                tv.setVisibility(View.VISIBLE);
                tv.setBackgroundColor(Color.RED);
                tv.setText(result);
            }
        });
    }

    public String jsonObject(String json_object) {
        try {
            JSONObject jsonObj = new JSONObject(json_object);
            return jsonObj.get("wind").toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
