package anviksha.com.tasktwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static anviksha.com.tasktwo.R.id.HelloText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.buttonChange);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt=findViewById(HelloText);
                String txt1=txt.getText().toString();
                String w="Hello World!";
                if(txt1.equals(w))
                    txt.setText("Goodbye World!");
                else
                    txt.setText("Hello World!");

            }});
    }
}
