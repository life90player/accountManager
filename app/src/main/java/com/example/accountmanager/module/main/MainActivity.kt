package com.example.accountmanager.module.main

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.RadioGroup
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.accountmanager.R
import com.example.accountmanager.base.BaseActivity
import com.example.accountmanager.base.BaseFragment
import com.example.accountmanager.module.debtUser.DebtUserFragment
import com.example.accountmanager.module.goodsManage.GoodsManageFragment
import com.example.accountmanager.module.onBack.OnBackFragment
import com.example.accountmanager.module.unBack.UnBackFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), RadioGroup.OnCheckedChangeListener,
    ViewPager.OnPageChangeListener {

    private val mFragmentsList = ArrayList<BaseFragment>()


    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment()
        rg_parent.setOnCheckedChangeListener(this)
        vp_content.addOnPageChangeListener(this)
        vp_content.adapter = PagerAdapter(
            mFragmentsList,
            supportFragmentManager,
            FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        )
    }

    fun addFragment (){
        Log.i(TAG, "init")
        mFragmentsList.add(UnBackFragment())
        mFragmentsList.add(OnBackFragment())
        mFragmentsList.add(GoodsManageFragment())
        mFragmentsList.add(DebtUserFragment())
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
        checkFragment(position)
    }

    override fun onPageScrollStateChanged(state: Int) {
    }

    fun checkFragment(index: Int) {
        rb_un_back.setTextColor(Color.BLACK)
        rb_on_back.setTextColor(Color.BLACK)
        rb_goods_manager.setTextColor(Color.BLACK)
        rb_debt_user.setTextColor(Color.BLACK)
        when (index) {
            0 -> {
                rb_un_back.isChecked = true
                rb_un_back.setTextColor(Color.WHITE)
            }
            1 -> {
                rb_on_back.isChecked = true
                rb_on_back.setTextColor(Color.WHITE)
            }
            2 -> {
                rb_goods_manager.isChecked = true
                rb_goods_manager.setTextColor(Color.WHITE)
            }
            3 -> {
                rb_debt_user.isChecked = true
                rb_debt_user.setTextColor(Color.WHITE)
            }
        }
        vp_content.setCurrentItem(index, false)
    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {//radioGroup选中监听
        when (checkedId) {
            R.id.rb_un_back -> {
                checkFragment(0)
            }
            R.id.rb_on_back -> {
                checkFragment(1)
            }
            R.id.rb_goods_manager -> {
                checkFragment(2)
            }
            R.id.rb_debt_user -> {
                checkFragment(3)
            }
        }
    }

    companion object {
        private val TAG = this::class.java.simpleName
    }
}
