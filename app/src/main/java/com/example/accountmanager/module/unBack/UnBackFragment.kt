package com.example.accountmanager.module.unBack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.accountmanager.R
import com.example.accountmanager.base.BaseFragment
import com.example.accountmanager.databinding.FragmentUnbackBinding
import com.example.accountmanager.module.monitData.DataMonitor
import kotlinx.android.synthetic.main.child_unback_main.*

class UnBackFragment : BaseFragment() {
    private val mAdapter by lazy {
        UnBackAdapter(R.layout.item_unback,mViewModel.listLiveData.value)}
    private val mViewModel by lazy{
        UnBackModel()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_content.layoutManager = LinearLayoutManager(context)
        rv_content.adapter = mAdapter
        mViewModel.listLiveData.observe(viewLifecycleOwner,androidx.lifecycle.Observer {
            mAdapter.data.clear()
            mAdapter.data.addAll(it)
            mAdapter.notifyDataSetChanged()
        })
        re.setOnClickListener {
            mViewModel.listLiveData.value = DataMonitor.unbackList
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentUnbackBinding>(inflater,R.layout.fragment_unback,container,false)
        binding.mViewModel = mViewModel
        return binding.root
    }
}
