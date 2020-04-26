package pc.example.practice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CustomPagerAdapter extends FragmentPagerAdapter {

    public CustomPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new Fragment1();
            case 1 :
                return new Fragment2();
            case 2 :
                return new Fragment3();
                default:return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Fragment 1";
            case 1:
                return "Fragment 2";
            case 2:
                return "Fragment";
            default:
                return null;
        }
    }
}
