package kz.step.cw_6_task_1

import android.os.Bundle
import android.os.PersistableBundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.provider.AlarmClock

class ActivitySecond: AppCompatActivity() {

    var textViewSecond: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)
        initializeViews()
        initializeLiseners()
    }

    private fun initializeViews() {
        textViewSecond = findViewById(R.id.textview)
    }

    private fun initializeLiseners() {
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        textViewSecond?.text = message
    }
}