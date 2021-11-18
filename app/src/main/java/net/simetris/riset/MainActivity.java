package net.simetris.riset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText _editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this._editText = this.findViewById(R.id.url_text);

    }

    public void route(View view) {
        Intent intent;

        int id = view.getId();

        if(id == R.id.api_button) {
            intent = new Intent(this.getBaseContext(), ApiActivity.class);
        } else if(id == R.id.echotest_button) {
            intent = new Intent(this.getBaseContext(), ApiActivity.class);
            //intent = new Intent(this.getBaseContext(), Echotest.class);
        } else if(id == R.id.datachannel_button) {
            intent = new Intent(this.getBaseContext(), DataChannelActivity.class);
        } else if(id == R.id.streaming_button) {
            intent = new Intent(this.getBaseContext(), VideoroomActvity.class);

//            intent = new Intent(this.getBaseContext(), Streaming.class);
        } else if(id == R.id.videoroom_button) {
            intent = new Intent(this.getBaseContext(), VideoroomActvity.class);
        } else {
            throw new Error("Invalid id");
        }

        intent.putExtra("HOST", this._editText.getText().toString());
        this.startActivity(intent);
    }
}