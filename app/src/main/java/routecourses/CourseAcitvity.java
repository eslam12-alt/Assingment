package routecourses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.window.SplashScreen;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.assingment.R;

import routecourses.details.Constant;

public class CourseAcitvity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_course_acitvity);




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }




    public void OnClickListener(View view) {
        if (view.getId() == R.id.android_button || view.getId() == R.id.android_courses) {
            navigation(Constant.Android);



            return;
        }
        if (view.getId() == R.id.ios_button || view.getId() == R.id.ios_courses) {
            navigation(Constant.Ios);
        return;


        }

        if (view.getId() == R.id.fullstack_button || view.getId() == R.id.fullstack_courses) {

            navigation(Constant.FullStack);

        }
    }

        public void navigation (String course ){
            Intent intent = new Intent(this, FullstackContent.class);
intent.putExtra("Course" ,course);
startActivity(intent);




    }}