package routecourses;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.assingment.R;

import routecourses.details.Constant;

public class FullstackContent extends AppCompatActivity {
ImageView courseIM;
TextView coursetX;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fullstack_content);
        courseIM=findViewById(R.id.android_image);
        coursetX=findViewById(R.id.course_content);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });





Intent intent=getIntent();
        if(intent==null)
            return;
String course= intent.getStringExtra(Constant.Course);
switch (course){
    case Constant.Android:{

        courseIM.setImageResource(R.drawable.android);
        coursetX.setText(R.string.Android);
        break;


}
    case Constant.Ios:{

        courseIM.setImageResource(R.drawable.ios);
        coursetX.setText(R.string.Ios);
    break;
        }
    case Constant.FullStack:{
        courseIM.setImageResource(R.drawable.fullstack);
        coursetX.setText(R.string.FullStack);

break;
}

}}}