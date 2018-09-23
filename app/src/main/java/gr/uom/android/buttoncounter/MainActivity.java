package gr.uom.android.buttoncounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  EditText userInput;
    private Button button;
    private TextView textView;
    private int numTimesClicked =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numTimesClicked++;
                String result = "\nThe button clicked " + numTimesClicked + " times";
                textView.append(result);
            }
        };
        button.setOnClickListener(onClickListener);
    }
}
