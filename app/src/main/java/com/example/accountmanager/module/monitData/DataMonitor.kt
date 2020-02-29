package com.example.accountmanager.module.monitData

import com.example.accountmanager.bean.UnbackBean
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class DataMonitor {

    companion object {
        val unbackList: List<UnbackBean>
            get() {
                val list = ArrayList<UnbackBean>()
                val calendar = Calendar.getInstance()
                val format = SimpleDateFormat("YYYY-MM-DD hh:mm:ss", Locale.CHINA)
                for (index in 1..100) {
                    list.add(
                        UnbackBean(
                            (index * 5).toLong(),
                            format.format(calendar.time),
                            format.format(calendar.time),
                            "user$index",
                            index%5 == 0
                        )
                    )
                }
                return list
            }

    }

}
