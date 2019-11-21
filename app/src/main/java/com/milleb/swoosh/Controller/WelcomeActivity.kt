package com.milleb.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.milleb.swoosh.R
import kotlinx.android.synthetic.main.activity_welcom.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
