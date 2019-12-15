package com.tjeit.a20191215_02_signuppractice

import android.os.Bundle

// SignUpActivity로 변경!
class SignUpActivity : BaseActivity() {

    var lastBackTimeValue = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    override fun setupEvents() {

        lastBackTimeValue = 10L
    }

    override fun setValues() {

        lastBackTimeValue = 20L
    }

}
