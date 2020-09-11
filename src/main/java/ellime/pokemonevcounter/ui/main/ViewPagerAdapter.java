package ellime.pokemonevcounter.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import ellime.pokemonevcounter.App;
import ellime.pokemonevcounter.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private static final String[] TAB_TITLES = new String[]{App.getAppResources().getString(R.string.tab_text_1), App.getAppResources().getString(R.string.tab_text_2)};
    private final List<Fragment> FRAGMENTS = new ArrayList<>(); // To allow dynamic adding of fragments

    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a Fragment
        return FRAGMENTS.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TAB_TITLES[position];
    }

    @Override
    public int getCount() {
        return FRAGMENTS.size();
    }

    public void AddFragment(Fragment fragment) {
        FRAGMENTS.add(fragment);
    }
}