package com.example.datalogger.adapters.viewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.datalogger.ui.fragments.AlarmsFragment
import com.example.datalogger.ui.fragments.DevicesFragment
import com.example.datalogger.ui.fragments.GraphFragment
import com.example.datalogger.ui.fragments.MainFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                MainFragment()
            }
            1 -> {
                GraphFragment()
            }
            2 -> {
                AlarmsFragment()
            }
            3 -> {
                DevicesFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}