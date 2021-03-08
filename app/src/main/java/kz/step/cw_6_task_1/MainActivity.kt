package kz.step.cw_6_task_1

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var btn: Button? = null
    var surname: String = "Башков"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    private fun initializeViews() {
        btn = findViewById(R.id.btn1)
    }

    private fun initializeLiseners() {

        btn?.setOnClickListener{

            var intent: Intent = Intent(this, ActivitySecond::class.java).apply {
                putExtra(EXTRA_MESSAGE, surname)
            }
            startActivity(intent)

        }
    }


}