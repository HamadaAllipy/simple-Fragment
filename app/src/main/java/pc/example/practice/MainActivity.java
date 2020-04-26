package pc.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager ;
    TabLayout tableLayout ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        tableLayout = findViewById(R.id.tab_layout);
        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(customPagerAdapter);
        tableLayout.setupWithViewPager(viewPager);
    }
}
