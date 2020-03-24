package com.example.accountmanager.module.unBack;

import android.text.Editable;

public interface OnViewOperateListener {
    void createUnBackOrder();
    void onCreditorNameChange(Editable edi);
    void onCreditorMoneyChange(Editable edi);
    void onCreditorRemark(Editable edi);
}
